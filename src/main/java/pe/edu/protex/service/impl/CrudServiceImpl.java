package pe.edu.protex.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.protex.service.CrudService;

@Service
public abstract class CrudServiceImpl<T, ID> implements CrudService<T, ID> {

	protected abstract JpaRepository<T, ID> getRespository();
	
	@Transactional(readOnly = true)
	@Override
	public List<T> findAll() throws Exception {
		return getRespository().findAll();
	}
	@Transactional(readOnly = true)
	@Override
	public Optional<T> findById(ID id) throws Exception {
		return getRespository().findById(id);
	}
	@Transactional
	@Override
	public T save(T entity) throws Exception {
		return getRespository().save(entity);
	}
	@Transactional
	@Override
	public T update(T entity) throws Exception {
		return getRespository().save(entity);
	}
	@Transactional
	@Override
	public void deleteById(ID id) throws Exception {
		getRespository().deleteById(id);		
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		getRespository().deleteAll();
	}

}
