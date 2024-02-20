public class Principal {
    public static void main(String[] args) {
        Cliente primeiro_cliente = new Cliente();

        primeiro_cliente.setNome("Uryel");
        primeiro_cliente.setCpf("12345678900");
        primeiro_cliente.setBancoDoCliente("Banco Caixa");
        primeiro_cliente.depositar(1000);
        primeiro_cliente.sacar(200);

        primeiro_cliente.informacoesDoCliente();








    }
}
