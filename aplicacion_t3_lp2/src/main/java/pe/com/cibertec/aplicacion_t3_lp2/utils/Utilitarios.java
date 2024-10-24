package pe.com.cibertec.aplicacion_t3_lp2.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.web.multipart.MultipartFile;

public class Utilitarios {
	
	public static String guardarImagen(MultipartFile foto) {
		try {
			//guardamos las fotos por medio del arreglo
			byte[] fotoBytes = foto.getBytes();
			Path pathImagen = Paths.get("src/main/resources/static/usuariofotos/" + 
						foto.getOriginalFilename());
			
			Files.write(pathImagen, fotoBytes);
			return foto.getOriginalFilename();
			
		} catch (IOException e) {
			System.out.print("Ocurrió un error:: " + e.getMessage());
			return null;
		}
	}
	//Extraemos el Hash
	public static String extraerHash (String passwordFormulario) {
		return BCrypt.hashpw(passwordFormulario, BCrypt.gensalt());
	}
	
	public static boolean checkPassword(String passwordFormulario,
			String hashPassword) {
		return BCrypt.checkpw(passwordFormulario, hashPassword);
	}
}