public class Cliente extends Transacao {

    // Atributos

    private String nome;
    private String cpf;


    // Gets e Sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Métodos

    public void informacoesDoCliente() {
        System.out.println("Cliente: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Banco: " + this.getBancoDoCliente());
        System.out.println("Saldo: " + this.getSaldoDoCliente());
        System.out.println("Transaçoes Recentes: " + this.getTransacaoTransaferencia());

    }

    public void trandferirValor (Cliente clienteQueTranfere,  Cliente clienteQueRecebe, double valor ){
        if(clienteQueTranfere.getSaldoDoCliente() >= valor) {
            clienteQueRecebe.depositar(valor);
            int incremento = clienteQueRecebe.getTransacaoTransaferencia();
            clienteQueRecebe.setTransacaoTransaferencia(incremento + 1);

        } else {
            System.out.println("Você não tem saldo suficiente para esta transferência.");
        }




    }


}
