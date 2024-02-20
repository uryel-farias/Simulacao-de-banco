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
        System.out.printf("Cliente: %s", this.nome);
        System.out.printf("CPF: %s",this.cpf);
        System.out.printf("Banco: %s",this.getBancoDoCliente());
        System.out.printf("Saldo: %f", this.getSaldoDoCliente());

    }


}
