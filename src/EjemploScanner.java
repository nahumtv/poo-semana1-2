// importar la funcionalida de Scanner
import java.util.Scanner;

public class EjemploScanner {
   public static void main(String[] args) {
       // Inicializar la clase Scanner
       Scanner sc = new Scanner(System.in);
       // Preguntarle al usuario por sus datos
       // Datos personales
       // Primer Nombre
       System.out.print("Ïngresa tu nombre:");
       // Captura la informacion ingresada por el teclado
       String name =  sc.nextLine(); // Retorna un string
       // Imprime el nombre ingresado
       System.out.println("Nombre ingresado: " + name);

       System.out.print("Ingresa tu nora:   ");
       double nota = sc.nextDouble();

       System.out.println("Nombre : " + name + " Nota : " + nota);

       sc.close();

   }
}
