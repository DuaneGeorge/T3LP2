package pe.com.cibertec.aplicacion_t3_lp2.service;

import java.util.List;

import pe.com.cibertec.aplicacion_t3_lp2.model.entity.ProductoEntity;

public interface ProductoService {
    List<ProductoEntity> buscarTodosProductos();
    ProductoEntity buscarProductoPorId(Integer id);
    
    void crearProducto(ProductoEntity productoEntity);
    void actualizarProducto(Integer id, ProductoEntity productoEntity);
    void eliminarProducto(Integer id);
}
