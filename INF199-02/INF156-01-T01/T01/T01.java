/**
 * INF156-01-T01
 * @author YordiSanchez, 21-0834
 * @version (may 11, 2023)
 */
import java.text.DecimalFormat; // Importamos librerias para el formato en numeros. 

public class T01
{
    // declaramos las variables que utilizaremos **. 
    String Cliente = "Yordi Sanchez"; 
    double cfijo = 100.00;
    double cplan = 275.50; 
    double ocargos = 95.00;
    final double ITBIS = 0.18;
    double subtotal;
    double montoitbis;
    double total; 
    //********************************************
    private static final DecimalFormat decfor = new DecimalFormat("0.00"); //indicamos como queremos mostrar el formato de los numeros 
    public void Resultado()
    {
        subtotal = cfijo + cplan + ocargos; // Sumamos los cargos fijos, cargos plan y otros cargos para obtener el subtotal.
        montoitbis = ITBIS * subtotal; // Multiplicamos el ITBIS y subtotal para obtener los impuestos de factura.
        total = subtotal + montoitbis; // Sumamos el subtotal y ITBIS para tener el total del resultado.
        System.out.println("             Factura de Cliente           "); // Imprimimos en pantalla "Factura Cliente"
        System.out.println("##########################################");
        System.out.println("# El Cliente: " + Cliente); // Se imprime el nombre del Cliente
        System.out.println("# Cargo: " + cfijo); // Se imprime el cargo fijo
        System.out.println("# Plan: " + cplan);// Se imprime el cargo del plan
        System.out.println("# Otros Cargos: " + ocargos);// Se imprime otros cargos
        System.out.println("# ITBIS: 18%");// Se imprime el ITBIS
        System.out.println("# Subtotal: " + decfor.format(subtotal));// Se imprime el subtotal
        System.out.println("# El monto total a pagar es: " + decfor.format(total)); //Mostrar en pantalla monto total a deber y que sea con dos decimales
        System.out.println("##########################################");
        System.out.println(" ");
        System.out.println("El cliente: " + Cliente + " debera pagar un total de RD$:" + total + " En su factura de telecable"); // Imprimir msj deseado.
    }
}
