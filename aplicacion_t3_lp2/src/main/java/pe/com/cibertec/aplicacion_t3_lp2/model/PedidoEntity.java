package pe.com.cibertec.aplicacion_t3_lp2.model;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.com.cibertec.aplicacion_t3_lp2.model.entity.UsuarioEntity;

@Entity
@Table(name = "tb_pedido")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PedidoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pedido_id", nullable = false)
	private Integer pedidoId;
	
	@Column(name = "fecha_compra")
	private LocalDate fechaCompra;
	
	@ManyToOne
	@JoinColumn(name = "fk_usuario", nullable = false)
	private UsuarioEntity usuarioEntity;
	
	@OneToMany(mappedBy = "pedidoEntity", cascade = CascadeType.ALL)
	private List<DetallePedidoEntity>detallePedido;
	
	
}
