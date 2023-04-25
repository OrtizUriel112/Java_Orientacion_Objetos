public class TestMetodos {
    public static void main(String[] args) {
        Cuenta cuentaUriel = new Cuenta();
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Uriel");
        cuentaUriel.setTitular(cliente1);
        //cuentaUriel.setTitular("Uriel");

        Cuenta cuentaMaria = new Cuenta();
        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Maria");
        cuentaMaria.setTitular(cliente2);
        //cuentaMaria.setTitular("Maria");


        cuentaUriel.setSaldo(1000);
        cuentaUriel.retirar(50);

        System.out.println(cuentaUriel.getTitular().getNombre()+": "+cuentaUriel.getSaldo());

        System.out.println(cuentaMaria.getTitular().getNombre()+": "+cuentaMaria.getSaldo());
        cuentaMaria.depositar(200, cuentaMaria);

        System.out.println(cuentaUriel.getTitular().getNombre()+": "+cuentaUriel.getSaldo());
        System.out.println(cuentaMaria.getTitular().getNombre()+": "+cuentaMaria.getSaldo());

        cuentaUriel.transferir(200, cuentaMaria);

        System.out.println(cuentaUriel.getTitular().getNombre()+": "+cuentaUriel.getSaldo());
        System.out.println(cuentaMaria.getTitular().getNombre()+": "+cuentaMaria.getSaldo());
    }
}
