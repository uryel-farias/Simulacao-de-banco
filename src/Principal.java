public class Principal {
    public static void main(String[] args) {
        Cliente primeiro_cliente = new Cliente();

        primeiro_cliente.setNome("Uryel");
        primeiro_cliente.setCpf("12345678900");
        primeiro_cliente.setBancoDoCliente("Banco Caixa");
        primeiro_cliente.depositar(1000);
        primeiro_cliente.sacar(200);

        Cliente segundo_cliente = new Cliente();
        segundo_cliente.setNome("Fabio");
        segundo_cliente.setCpf("95195195155");
        segundo_cliente.setBancoDoCliente("Banco Santander");
        segundo_cliente.depositar(2000);

        primeiro_cliente.trandferirValor(primeiro_cliente, segundo_cliente, 5000);
        //primeiro_cliente.trandferirValor(primeiro_cliente,  segundo_cliente, 200);

        segundo_cliente.informacoesDoCliente();










    }
}
