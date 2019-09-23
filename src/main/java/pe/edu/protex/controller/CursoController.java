package pe.edu.protex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cursos")
public class CursoController {
	
	@GetMapping
	public String Index() {
		return "cursos/index";
	}
}
