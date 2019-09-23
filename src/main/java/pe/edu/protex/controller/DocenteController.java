package pe.edu.protex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/docentes")
public class DocenteController {
	
	@GetMapping
	public String Index() {
		return "docentes/index";
	}
}
