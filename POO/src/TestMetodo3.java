public class TestMetodo3 {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Uriel");
        cuenta1.setTitular(cliente1);
        System.out.println(cuenta1.getTitular().getNombre());
    }
}
