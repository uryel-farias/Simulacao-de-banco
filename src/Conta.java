public class Conta {
    private int numeroDaConta;
    private String tipoDaConta;
    private double saldoConta;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getTipoDaConta() {
        return tipoDaConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setTipoDaConta(String tipoDaConta) {
        this.tipoDaConta = tipoDaConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void depositar(double valor){
        saldoConta += valor;
    }
}


