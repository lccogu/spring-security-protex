package pe.edu.protex.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

	@Id
	@Column(name = "estudiante_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	
	@Column(name = "codigo",length = 9, 
			nullable = false, unique = true)
	private String codigo;
	
	@Column(name = "dni",length = 8, nullable = false)
	private String dni;
	
	@Column(name = "apellidos",length = 40, nullable = false)
	private String apellidos;
	
	@Column(name = "nombres",length = 40, nullable = false)
	private String nombres;
	
	@Column(name = "direccion",length = 60)
	private String direccion;
	
	@Column(name = "edad", columnDefinition = "SMALLINT")
	private Integer edad;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_nacimiento")
	private Date fechaNacimiento;
	
	@ManyToOne
	@JoinColumn(name = "carrera_id")
	private Carrera carrera;
	
	@OneToMany(mappedBy = "estudiante", fetch = FetchType.LAZY)
	private List<EstudianteCurso> estudianteCursos;
	
	public Estudiante() {
		estudianteCursos = new ArrayList<>();
	}
	
	//-----------------------------
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public List<EstudianteCurso> getEstudianteCursos() {
		return estudianteCursos;
	}

	public void setEstudianteCursos(List<EstudianteCurso> estudianteCursos) {
		this.estudianteCursos = estudianteCursos;
	}
	
	
}


