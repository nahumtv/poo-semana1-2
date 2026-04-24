import java.util.Scanner;

public class CalculadoraNotas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingesa tu nombre :");
        String name = sc.nextLine();

        System.out.print("Nota 1: ");
        double firstGrade = sc.nextDouble(); 

        while(firstGrade < 0 || firstGrade >20){
            System.out.print("Nota inválida, ingrese nuevamente : ");
            firstGrade = sc.nextDouble(); 
        }

        System.out.print("Nota 2: ");
        double secondGrade = sc.nextDouble(); 

        while(secondGrade < 0 || secondGrade >20){
            System.out.print("Nota inválida, ingrese nuevamente: ");
            secondGrade = sc.nextDouble(); 
        }

        System.out.print("Nota 3: ");
        double thridGrade = sc.nextDouble(); 
        
        while(thridGrade < 0 || thridGrade >20){
            System.out.print("Nota inválida, ingrese nuevamente: ");
            thridGrade = sc.nextDouble(); 
        }


        double average = firstGrade*0.3 + secondGrade*0.3 + thridGrade*0.4;
        String averageState = "Desaprobado";

        if(average >= 14) {
            averageState = "Aprobado con distinción";
        } else if (average >= 11){
            averageState = "Aprobado";
        } else if(average >= 5) {
            averageState = "En recuperación";
        }

        System.out.println();
        System.out.println("------ RESULTADO------");
        System.out.println("Estudiante : " + name.toUpperCase());
        System.out.println("Promedio : " + average );
        System.out.println("Estado: " + averageState);

        sc.close();
        
    }
}
