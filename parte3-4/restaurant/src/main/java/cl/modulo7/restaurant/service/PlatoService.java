package cl.modulo7.restaurant.service;
import cl.modulo7.restaurant.repository.PlatoRepository;
import cl.modulo7.restaurant.dto.Plato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlatoService {
    private final PlatoRepository platoRepository;

    @Autowired
    public PlatoService(PlatoRepository platoRepository) {
        this.platoRepository = platoRepository;
    }

    public List<Plato> getAllPlatos() {
        return platoRepository.findAll();
    }

    public Optional<Plato> getPlatoById(int id) {
        return platoRepository.findById(id);
    }

    public Plato createPlato(Plato plato) {
        return platoRepository.save(plato);
    }

    public Plato updatePlato(int id, Plato updatedPlato) {
        Optional<Plato> optionalPlato = platoRepository.findById(id);
        if (optionalPlato.isPresent()) {
            Plato plato = optionalPlato.get();
            plato.setNombre(updatedPlato.getNombre());
            plato.setDescripcion(updatedPlato.getDescripcion());
            plato.setPrecio(updatedPlato.getPrecio());
            plato.setCategoria(updatedPlato.getCategoria());
            return platoRepository.save(plato);
        } else {
            throw new RuntimeException("Plato no encontrado con ID: " + id);
        }
    }

    public void deletePlato(int id) {
        platoRepository.deleteById(id);
    }
}
