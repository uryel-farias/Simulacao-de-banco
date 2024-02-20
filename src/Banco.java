public class Banco {

    // Atributos

    private String bancoDoCliente;
    private double saldoDoCliente;

    // Gets e Sets

    public String getBancoDoCliente() {
        return bancoDoCliente;
    }

    public void setBancoDoCliente(String bancoDoCliente) {
        this.bancoDoCliente = bancoDoCliente;
    }

    public double getSaldoDoCliente() {
        return saldoDoCliente;
    }

    public void setSaldoDoCliente() {
        this.saldoDoCliente = saldoDoCliente;
    }

    // Métodos

    public void depositar(double valor) {
        if(valor <= 0) {
            System.out.println("Digite um valor maior que zero.");
        } else {
            saldoDoCliente += valor;
        }

    }

    public void sacar(double valor) {
        if(valor > saldoDoCliente) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldoDoCliente -= valor;
        }
    }
}
