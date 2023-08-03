package cl.modulo7.restaurant.service;

import cl.modulo7.restaurant.dto.Pedido;
import cl.modulo7.restaurant.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> obtenerPedidosConCamareros() {
        return pedidoRepository.findAll();
    }
}
