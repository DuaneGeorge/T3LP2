package pe.com.cibertec.aplicacion_t3_lp2.service.impl;



import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pe.com.cibertec.aplicacion_t3_lp2.model.PedidoEntity;
import pe.com.cibertec.aplicacion_t3_lp2.repository.PedidoRepository;
import pe.com.cibertec.aplicacion_t3_lp2.service.PedidoService;

@Service
@RequiredArgsConstructor
public class PedidoServiceImpl implements PedidoService{
	private final PedidoRepository pedidoRepository;
	
	@Override
	public void crearPedido(PedidoEntity pedidoEntity) {
		pedidoRepository.save(pedidoEntity);
		
	}

}