package pe.com.cibertec.aplicacion_t3_lp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.com.cibertec.aplicacion_t3_lp2.model.entity.ProductoEntity;


@Repository
public interface ProductoRepository extends JpaRepository<ProductoEntity, Integer> {
}