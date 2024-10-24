package pe.com.cibertec.aplicacion_t3_lp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.com.cibertec.aplicacion_t3_lp2.model.PedidoEntity;


@Repository
public interface PedidoRepository extends JpaRepository<PedidoEntity, Integer>{

}