package cl.modulo7.restaurant.controller;

import cl.modulo7.restaurant.dto.Pedido;
import cl.modulo7.restaurant.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/pedidos")
    public String obtenerPedidos(Model model) {
        List<Pedido> pedidos = pedidoService.obtenerPedidosConCamareros();
        model.addAttribute("pedidos", pedidos);
        return "listarpedidos";
    }
}
