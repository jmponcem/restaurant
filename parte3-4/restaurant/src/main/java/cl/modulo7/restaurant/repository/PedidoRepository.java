package cl.modulo7.restaurant.repository;

import cl.modulo7.restaurant.dto.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository <Pedido, Integer> {
}
