public class Principal {
    public static void main(String[] args) {
        Cliente primeiro_cliente = new Cliente();

        primeiro_cliente.setNome("Uryel");
        primeiro_cliente.setCpf("12345678900");

        primeiro_cliente.setNumeroDaConta(144);
        primeiro_cliente.setSaldoConta(1200.00);
        primeiro_cliente.setTipoDaConta("Conta Corrente");

        System.out.println("Cliente: " + primeiro_cliente.getNome());
        System.out.println("CPF: " + primeiro_cliente.getCpf());
        System.out.println("Tipo da Conta: " + primeiro_cliente.getTipoDaConta());
        System.out.println("Número da conta: " + primeiro_cliente.getNumeroDaConta());
        System.out.println("Saldo: " + primeiro_cliente.getSaldoConta());

        primeiro_cliente.depositar(200);
        System.out.println("Novo Saldo: " + primeiro_cliente.getSaldoConta());

        primeiro_cliente.sacar( 50);
        System.out.println("Saldo depois do saque: " + primeiro_cliente.getSaldoConta());

    }
}
