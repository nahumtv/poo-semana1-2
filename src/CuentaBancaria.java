public class CuentaBancaria {
    private double saldo;
    // Get - lectura del valor 
    public double getSaldo(){
        return saldo;
    } 
    // Set - establecer el valor
    public void setSaldo(double _saldo){
        // Regla: el saldo debe ser mayor o igual a 0
        if(_saldo >= 0){
            this.saldo = _saldo;
        }else{
            System.out.println("Saldo invalido");
        }
    }
}

