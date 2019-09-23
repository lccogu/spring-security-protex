package pe.edu.protex.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cursos")
public class Curso {

	@Id
	@Column(name = "curso_id", columnDefinition = "SMALLINT")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	
	@Column(name = "nombre",length = 40, nullable = false)
	private String nombre;
	
	@Column(name = "semestre")
	private char semestre;
	
	@Column(name = "credito", columnDefinition = "SMALLINT")
	private Integer credito;
	
	@OneToMany(mappedBy = "curso", fetch = FetchType.LAZY)
	private List<EstudianteCurso> estudianteCursos;
	
	public Curso() {
		estudianteCursos = new ArrayList<>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSemestre() {
		return semestre;
	}

	public void setSemestre(char semestre) {
		this.semestre = semestre;
	}

	public Integer getCredito() {
		return credito;
	}

	public void setCredito(Integer credito) {
		this.credito = credito;
	}

	public List<EstudianteCurso> getEstudianteCursos() {
		return estudianteCursos;
	}

	public void setEstudianteCursos(List<EstudianteCurso> estudianteCursos) {
		this.estudianteCursos = estudianteCursos;
	}
	
}







