public class contaPoupanca extends contaBancaria {
    int diaDeRendiemento;

    public contaPoupanca(String cliente, int num_conta, double saldoInical, int diaDeRendiemento) {
        super(cliente, num_conta, saldoInical);
        this.diaDeRendiemento = diaDeRendiemento;
    }

    public void calcularNovoSaldo() {
        double rendimento = saldo * 0.005;
        saldp += rendimento;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Dia de rendimento: " + diaDeRendiemento);
    }
}