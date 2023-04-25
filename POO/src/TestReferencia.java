public class TestReferencia {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.setSaldo(14);
        Cuenta cuenta2 = cuenta;
        // Cuenta cuenta2 = new Cuenta();
        cuenta2.setSaldo(+18);

        System.out.println(cuenta);
        System.out.println(cuenta2);

        if (cuenta == cuenta2){
            System.out.println("Son la misma cuenta");
        }else{
            System.out.println("Son diferentes cuentas");
        }
    }
}
