public class Cuenta{
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    private static int total;
    public Cuenta(int agencia){
        int total=this.total;
            if (agencia<=0){
                System.out.println("No se permiten 0");
                this.agencia = 1;
            }else{
                this.agencia = agencia;
            }
        this.total += total;
        System.out.println("Cuentas totales: "+this.total);
    }

    public Cuenta(){
        this.total = total;
    }

    double retirar(double valor){
        if (validarCantidades(this.saldo, valor)){
            this.saldo = this.saldo - valor;
            return this.saldo;
        }else{
            return 0;
        }
    }
    void depositar(double valor, Cuenta cuenta){
        cuenta.setSaldo(cuenta.getSaldo()+valor);
    }
    void transferir(double valor, Cuenta cuenta){
        this.saldo = this.saldo - valor;
        cuenta.depositar(valor, cuenta);

    }
    boolean validarCantidades(double saldo, double valor){
        if (valor>saldo){
            return false;
        }else{
            return true;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
