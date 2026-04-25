import java.util.HashMap;

public class HashmapDemo {
    public static void main(String[] args){
        // Crear HashMap
        HashMap diccionario = new HashMap<>(); // Usa clave valor
        diccionario.put("A001", "011-2318-661177");
        diccionario.put("A002", "123-1672-142278");
        diccionario.put("A003", "251-6783-142123");
        diccionario.put("A004", "339-0172-142767");
        //Mostrar hashmap
        for(Object clave : diccionario.keySet()){
            System.out.println(clave + " : " + diccionario.get(clave));
        }
    }
}

