
/**
 * Conversion de pesos a dolares
 *
 * Yordi Sanchez, 21-0834
 * @version May 24, 2023
 */

//llamamos a la libreria scan para que podamos capturar los datos introducidos.
import java.util.Scanner;

public class Cliente
{
    
    //creamos variables
   Scanner leer=new Scanner (System.in); 
   double pesos, dolar ; 
   
   public void Scan()
   {
       //introduciremos los datos que queremos capturar.
   System.out.print("Introduzca nombre: ");
   String nombre = leer.nextLine();
   System.out.print("Introduzca apellido: ");
   String apellido = leer.nextLine();
   // Se imprime el nombre del usuario
   System.out.println("Bienvenido, " + nombre + " " + apellido);
   // Se introduce el valor de peso, se lee y se procede a convertir con la formula
   System.out.println("Favor ingrese el valor en pesos:  ");
   pesos = leer.nextDouble();
   dolar = pesos*0.018;
   // Se muestra resultado y se utiliza "%.2f" para mostrar solo dos decimales.
   String df = String.format("%.2f", dolar);
   System.out.println("El resultado es: $" + df);
   }
    
}
