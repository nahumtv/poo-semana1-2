public class Estudiante {
    // Atributos
    private String codigo;
    private String nombres;
    private String apellidos;
    private String dni;
    private String carrera;
    private int edad;
    private boolean estaMatriculado;
    
    //Constructor por defecto
    public Estudiante(){
        
    }
    // Sobrecarga de contructor
    public Estudiante(String _nombre, String _apellidos, 
        String _carrera, int _edad, String _codigo, String _dni, boolean _estaMatriculado){
            setCodigo(_codigo);
            setNombres(_nombre);
            setApellidos(_apellidos);
            setDni(_dni);
            setCarrera(_carrera);
            setEdad(_edad);
            setEstaMatriculado(_estaMatriculado);
        }
    // Metodos
    public String informacionBasica(){
        return "DNI: " + dni + "\nNombres: " + nombres + "\nApellidos: " + apellidos;
    }

    public String informacionBasica(boolean _estaMatriculado){
        if(_estaMatriculado){
            return "Codigo: " + codigo + "\nNombres: " + nombres + "\nApellidos: " + apellidos + "\nCarrera: " + carrera;
        }
        return "No esta matriculado";
    }

    // Get y Set
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String _codigo) {
        this.codigo = _codigo;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String _nombres) {
        this.nombres = _nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String _apellidos) {
        this.apellidos = _apellidos;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String _dni) { 
        if(_dni.length() == 8){ // DNI VALIDO
            this.dni = _dni; 
        }else{
            System.out.println("Verifique que el DNI tenga 8 números");
        }  
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String _carrera) {
        this.carrera = _carrera;
    }
    public int getEdad() { 
        return edad;
    }
    public void setEdad(int _edad) {
        // validar rango de edad valido
        if(_edad >= 0 && _edad <= 80){
            this.edad = _edad;    
        }else{
            System.out.println("Rango de edad inválido");
        }
    }
    public boolean isEstaMatriculado() {
        return estaMatriculado;
    }
    public void setEstaMatriculado(boolean _estaMatriculado) {
        this.estaMatriculado = _estaMatriculado;
    }
}

