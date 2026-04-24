import java.util.Scanner;

public class AnalizadorTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una oración completa : ");
        String text = sc.nextLine();

        String[] texts = text.split(" ");
        int firstIndex = 0;
        int lastIndex = texts.length - 1;

        System.out.println();
        System.out.println("N[umero de caracteres : " + text.length());
        System.out.println("Oración en MAYÚSCULAS : " + text.toUpperCase());
        System.out.println("Oración en minúsculas : " + text.toLowerCase());
        System.out.println("Primera palabra con split : " + texts[firstIndex]);
        System.out.println("Última palabra con split() : " + texts[lastIndex]);
        System.out.println("Primera palabra con substring() : " + text.substring(0,7));
        System.out.println("Primera palabra con substring() : " + text.substring(19));
        System.out.println("Con @ en lugar de a : " + text.replace("a", "@"));
        System.out.println("¿Contiene 'Java'? : " + text.contains("Java"));
        


        sc.close();
    }

}