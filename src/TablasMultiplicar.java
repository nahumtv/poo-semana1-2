import java.util.Scanner;

public class TablasMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número (1-10): ");
        int value =  sc.nextInt();
        int maxValue = 12;
        if (value <1 || value > 10){
            System.out.println("Número inválido, valor permitido del 1 al 10");
        } else {
            System.out.println();
            System.out.println("=== TABLA DEL "+value+" ===");

            for( int i=1;i<=maxValue;i++) {
                for (int j=1; j<=value;j++){
                    System.out.print(j +" x " + i + " = " + i*j + "\t");
                }
                System.out.println();
            }
        }

        sc.close();


    }
}
