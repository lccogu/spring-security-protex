package pe.edu.protex.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.protex.model.entity.Carrera;
import pe.edu.protex.model.repository.CarreraRepository;
import pe.edu.protex.service.CarreraService;

@Service
public class CarreraServiceImpl extends CrudServiceImpl<Carrera, Integer>implements CarreraService {

	@Autowired
	private CarreraRepository carreraRepository;

	@Override
	protected JpaRepository<Carrera, Integer> getRespository() {
		// TODO Auto-generated method stub
		return carreraRepository;
	}

}
