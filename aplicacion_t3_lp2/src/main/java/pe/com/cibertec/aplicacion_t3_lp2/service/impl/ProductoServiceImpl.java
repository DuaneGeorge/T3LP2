package pe.com.cibertec.aplicacion_t3_lp2.service.impl;

import lombok.RequiredArgsConstructor;
import pe.com.cibertec.aplicacion_t3_lp2.model.entity.ProductoEntity;
import pe.com.cibertec.aplicacion_t3_lp2.repository.ProductoRepository;
import pe.com.cibertec.aplicacion_t3_lp2.service.ProductoService;

import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;

    @Override
    public List<ProductoEntity> buscarTodosProductos() {
        return productoRepository.findAll();
    }


    @Override
    public ProductoEntity buscarProductoPorId(Integer id) {
        return productoRepository.findById(id).get();
    }


	@Override
	public void crearProducto(ProductoEntity productoEntity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actualizarProducto(Integer id, ProductoEntity productoEntity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		
	}
}