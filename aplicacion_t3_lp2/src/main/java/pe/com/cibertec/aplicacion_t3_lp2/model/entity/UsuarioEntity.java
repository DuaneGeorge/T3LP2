package pe.com.cibertec.aplicacion_t3_lp2.model.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioEntity {

	@Id
	@Column(name = "correo", nullable = false, length = 70)
	private String correo;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Column(name = "nombre", nullable = false, length = 70)
	private String nombre;
	
	@Column(name = "apellido", nullable = false, length = 70)
	private String apellido;
	
	@Column(name = "fechaNacimiento", nullable = false, length = 10)
	private LocalDate fechaNacimiento;
	
	@Column(name = "url_imagen")
	private String urlImagen;
}