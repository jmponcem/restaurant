package cl.modulo7.restaurant.controller;
import cl.modulo7.restaurant.dto.Plato;
import cl.modulo7.restaurant.service.PlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/platos")
public class PlatoController {
    private final PlatoService platoService;

    @Autowired
    public PlatoController(PlatoService platoService) {
        this.platoService = platoService;
    }

    @GetMapping
    public ResponseEntity<List<Plato>> getAllPlatos() {
        List<Plato> platos = platoService.getAllPlatos();
        return ResponseEntity.ok(platos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Plato> getPlatoById(@PathVariable int id) {
        Optional<Plato> optionalPlato = platoService.getPlatoById(id);
        return optionalPlato.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Plato> createPlato(@RequestBody Plato plato) {
        Plato createdPlato = platoService.createPlato(plato);
        return ResponseEntity.ok(createdPlato);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Plato> updatePlato(@PathVariable int id, @RequestBody Plato updatedPlato) {
        Plato updatedPlatoObj = platoService.updatePlato(id, updatedPlato);
        return ResponseEntity.ok(updatedPlatoObj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlato(@PathVariable int id) {
        platoService.deletePlato(id);
        return ResponseEntity.noContent().build();
    }
}
