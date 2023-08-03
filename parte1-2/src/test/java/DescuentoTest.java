import org.example.Descuento;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class DescuentoTest {

    @Test
    public void testDescuentoplatos(){
        List<Integer> detallePedido = List.of(10);
        double descuento = Descuento.DescuentoPlatos(detallePedido);
        assertEquals (0.05,descuento);
    }

    @Test
    public void testDescuentoPlatosMesas(){
        int cantidadPlatos = 16;
        int capacidadMesa = 7;
        double descplame = Descuento.DescuentoPlatosMesas(cantidadPlatos, capacidadMesa);
        assertEquals(0.3,descplame);
    }


}
