package pe.com.cibertec.aplicacion_t3_lp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.com.cibertec.aplicacion_t3_lp2.model.entity.UsuarioEntity;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, String>{
	UsuarioEntity findByCorreo(String correo);
}
