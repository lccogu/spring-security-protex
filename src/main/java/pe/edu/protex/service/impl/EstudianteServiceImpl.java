package pe.edu.protex.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.protex.model.entity.Estudiante;
import pe.edu.protex.model.repository.EstudianteRepository;
import pe.edu.protex.service.EstudianteService;

@Service
public class EstudianteServiceImpl extends CrudServiceImpl<Estudiante, Integer> implements EstudianteService {

	@Autowired
	private EstudianteRepository estudianteRepository;
	
	@Override
	protected JpaRepository<Estudiante, Integer> getRespository() {
		// TODO Auto-generated method stub
		return estudianteRepository;
	}

}
