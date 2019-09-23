package pe.edu.protex;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import pe.edu.protex.model.entity.Authority;
import pe.edu.protex.model.entity.Carrera;
import pe.edu.protex.model.entity.Usuario;
import pe.edu.protex.model.repository.CarreraRepository;
import pe.edu.protex.model.repository.UsuarioRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProtexApplicationTests {

	@Autowired
	private CarreraRepository carreraRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Test
	public void contextLoads() {
		Carrera carrera = new Carrera();
		carrera.setNombre("Ing de Electronica");
		carrera.setFacultad("Ingenieria");
		
		Carrera retorno = carreraRepository.save(carrera);
		
		
		
		Optional<Usuario> buscado = usuarioRepository.findByUsername("admin");
		if(buscado.isPresent()) {
			Usuario usuario = buscado.get();
			
			List<Authority> authores = usuario.getAuthorities();
			for (Authority authority : authores) {
				System.out.println(authority.getAuthority());
			}

		}
		assertTrue(carrera.getFacultad().equalsIgnoreCase(retorno.getFacultad()));
	}

}
