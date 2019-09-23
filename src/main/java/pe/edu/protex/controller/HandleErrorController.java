package pe.edu.protex.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class HandleErrorController implements ErrorController{

	private static final String PATH = "/error";
	
	@GetMapping
	public String handleError(HttpServletRequest request, Model model) {
		
		// Get the erro status code
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		if (status != null) {
	        Integer statusCode = Integer.valueOf(status.toString());
	        model.addAttribute("statusCode", statusCode);
	    }
		
		// Get Error Exception
		Exception exception = (Exception)request.getAttribute(RequestDispatcher.ERROR_EXCEPTION);
		if( exception != null )
			model.addAttribute("exception", exception.getMessage());
		
		// Get the uri
		String uri = (String)request.getAttribute(RequestDispatcher.ERROR_REQUEST_URI);
		model.addAttribute("uri", uri);
	    
        return "error";
    }
	
	@Override
    public String getErrorPath() {
        return PATH;
    }
}
