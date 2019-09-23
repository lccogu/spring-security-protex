package pe.edu.protex.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.protex.model.entity.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
