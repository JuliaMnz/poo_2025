public class contaBancaria {
    String cliente;
    int num_conta;
    float saldo;

    public contaBancaria(String cliente, int num_conta, float saldoInical) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldoInical;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
}