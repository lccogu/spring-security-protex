package pe.edu.protex.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.protex.model.entity.EstudianteCurso;
import pe.edu.protex.model.repository.EstudianteCursoRepository;
import pe.edu.protex.service.EstudianteCursoService;

@Service
public class EstudianteCursoServiceImpl extends CrudServiceImpl<EstudianteCurso, Integer> 
	implements EstudianteCursoService {

	@Autowired
	private EstudianteCursoRepository estudianteCursoRepository;
	
	@Override
	protected JpaRepository<EstudianteCurso, Integer> getRespository() {
		// TODO Auto-generated method stub
		return estudianteCursoRepository;
	}

}
