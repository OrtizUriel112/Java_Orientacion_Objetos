public class TestMetodos2 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Uriel");
        cliente1.setTelefono("123123123");

        Cuenta cuenta1 = new Cuenta();
        cuenta1.setTitular(cliente1);

        System.out.println(cuenta1.getTitular().getNombre());
        System.out.println(cuenta1.getTitular());
        System.out.println(cliente1);
    }
}
