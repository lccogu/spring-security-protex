package pe.edu.protex.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.protex.model.entity.Curso;
import pe.edu.protex.model.repository.CursoRepository;
import pe.edu.protex.service.CursoService;

@Service
public class CursoServiceImpl extends CrudServiceImpl<Curso, Integer> implements CursoService {

	@Autowired
	private CursoRepository cursoRepository;
	
	@Override
	protected JpaRepository<Curso, Integer> getRespository() {
		// TODO Auto-generated method stub
		return cursoRepository;
	}


}
