package pe.com.cibertec.aplicacion_t3_lp2.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import lombok.RequiredArgsConstructor;
import pe.com.cibertec.aplicacion_t3_lp2.model.entity.UsuarioEntity;
import pe.com.cibertec.aplicacion_t3_lp2.repository.UsuarioRepository;
import pe.com.cibertec.aplicacion_t3_lp2.service.UsuarioService;
import pe.com.cibertec.aplicacion_t3_lp2.utils.Utilitarios;
import pe.com.cibertec.aplicacion_t3_lp2.service.UsuarioService;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService{

	private final UsuarioRepository usuarioRepository;

	//CREAR USUARIO
	@Override
	public void crearUsuario(UsuarioEntity usuarioEntity, MultipartFile foto) {
		String nombreFoto = Utilitarios.guardarImagen(foto);
		usuarioEntity.setUrlImagen(nombreFoto);
		
		String passwordHash = Utilitarios.extraerHash(usuarioEntity.getPassword());
		usuarioEntity.setPassword(passwordHash);
		
		usuarioRepository.save(usuarioEntity);		
	}

	@Override
	public boolean validarUsuario(UsuarioEntity usuarioFormulario) {
			UsuarioEntity usuarioEncontrado = usuarioRepository
					.findByCorreo(usuarioFormulario.getCorreo());		
			if(usuarioEncontrado == null) {
				return false;
			}
			if(!Utilitarios.checkPassword(usuarioFormulario.getPassword(),
					usuarioEncontrado.getPassword())) {
				return false;
			}

		return true;
	}

	@Override
	public UsuarioEntity buscarUsuarioPorCorreo(String correo) {
		 //TODO Auto-generated method stub
		return usuarioRepository.findByCorreo(correo);
	}

}