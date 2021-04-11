

import com.SanValero.Cliente;
import com.SanValero.Empleado;
import com.SanValero.Ordenador;

public class Aplicacion {
    public static void main(String[]args){
        Ordenador ordenador;
        Cliente cliente;
        Empleado empleado;

    ordenador = new Ordenador("Intel", "z40", 754, "Ram", true, "Intel");
    cliente = new Cliente("Jorge", "Argualas", 34, true, "Maria");
    empleado = new Empleado("Adrian", "74642478C", 67, false, "75348545H");

    ordenador.getCausa();


    ordenador.piezasMarcaIguales();
    cliente.nombresIguales();
    empleado.DniAsociadosTarjeta();






    }
}
