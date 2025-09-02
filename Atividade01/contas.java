public class contas {
    public static void main(String[] args) {
        
        contaPoupanca cp = new contaPoupanca("Maria", 123, 1000.0, 5);

        contaEspecial ce = new contaEspecial("João", 456, 500.0, 1000);

        cp.depositar(200);
        ce.depositar(300);

        boolean saque1 = cp.sacar(500);
        boolean saque2 = ce.sacar(1000);

        cp.calcularNovoSaldo();

        System.out.println("Dados da conta poupança");
        cp.mostrarDados();
        System.out.println("Dados da conta especial");
        ce.mostrarDados();

        System.out.println("Saque Maria realizado " + saque1);
        System.out.println("Saque João realizado " + saque2);
    }
}