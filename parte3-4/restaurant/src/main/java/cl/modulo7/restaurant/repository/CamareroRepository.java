package cl.modulo7.restaurant.repository;

import cl.modulo7.restaurant.dto.Camarero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CamareroRepository extends JpaRepository <Camarero, Integer> {
}
