public class SistemaMatricula {
    public static void main(String[] args){
        Estudiante ana = new Estudiante(); // Usando el constructor por defecto
        System.out.println("############## Sistema de Matricula #################");
        ana.setNombres("Ana Karina");
        ana.setApellidos("Martos Torres");
        ana.setCarrera("");
        ana.setEdad(19);
        ana.setCodigo("");
        ana.setDni("44128717");
        ana.setEstaMatriculado(false);
        System.out.println(ana.informacionBasica());

        System.out.println("-----------------------------------------");
        Estudiante kevin = new Estudiante("Kevin", "Perez Jurado", "Ingenieria Industrial", 
        20, "N2135674","46612671", true); // Usando el constructor sobrecargado
        System.out.println(kevin.informacionBasica(true));
    }
}

