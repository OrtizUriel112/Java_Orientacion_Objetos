public class CrearCuenta {

        public static void main(String[]args){
            Cuenta cuenta = new Cuenta();

            cuenta.setSaldo(200);
            cuenta.setAgencia(1);
            cuenta.setNumero(123);
            //cuenta.setTitular("Francisco");

            System.out.println(cuenta.getSaldo());
        }
}
