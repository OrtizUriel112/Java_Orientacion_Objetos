public class PruebaAcceso {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.setSaldo(200);

        System.out.println(cuenta.getSaldo());
        cuenta.retirar(300);
        if(cuenta.retirar(180)<=0){
            System.out.println("Saldo insuficiente");
        }
        System.out.println(cuenta.getSaldo());

        Cuenta cuenta1 = new Cuenta(55);
        Cuenta cuenta2 = new Cuenta(22);
        System.out.println(cuenta1.getAgencia());
    }
}
