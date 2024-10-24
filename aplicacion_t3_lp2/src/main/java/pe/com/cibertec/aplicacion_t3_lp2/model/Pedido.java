package pe.com.cibertec.aplicacion_t3_lp2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {
	private Integer cantidad;
	private Integer productoId;
}