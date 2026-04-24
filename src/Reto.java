import java.util.Scanner;
import java.util.Random;

public class Reto {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        Random rnd = new Random();
        int age, registrationNumber, yearUntilRetirement;
        double grade;
        String name, gradeLabel;

        System.out.print("Ingrese su nombre : ");
        name = sc.nextLine();
        
        System.out.print("Edad : ");
        age = sc.nextInt();

        System.out.print("Nota : ");
        grade = sc.nextDouble();

        registrationNumber = rnd.nextInt(10000,100000);
        yearUntilRetirement = Math.abs(65 - age);

        if(Math.round(grade) > 10) {
            gradeLabel = "Aprob[o";
        } else if (grade >= 5) {
            gradeLabel = "Est[a en recuperaci[on";
        } else {
            gradeLabel = "Desaprobado";
        }

        System.out.println(" Nombre : " + name.toUpperCase());
        System.out.println(" Estado : " + gradeLabel);
        System.out.println(" Nro de Matr[icula : " + registrationNumber);
        System.out.println(" Años para jubilación : " + yearUntilRetirement);


        sc.close();

    }
}
