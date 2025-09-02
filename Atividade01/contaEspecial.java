public class contaEspecial extends contaBancaria {
    float limite;

    public contaEspecial(String cliente, int num_conta, double saldoInical, float limite) {
        super(cliente, num_conta, saldoInical);
        this.limite = limite;
    }

    public boolean sacar(double valor) {
        if(valor > 0 && saldo + limite >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Limite: " + limite);
    }
}