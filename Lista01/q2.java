class Cliente {
    private String nome;
    private String cpf;
    private int saldo;
    private int numConta;

    // Construtor completo
    public Cliente(String nome, String cpf, int saldo, int numConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numConta = numConta;
    }

    // Construtor com conta zerada
    public Cliente(String nome, String cpf, int numConta) {
        this(nome, cpf, 0, numConta);
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public int getSaldo() { return saldo; }
    public void setSaldo(int saldo) { this.saldo = saldo; }

    public int getNumConta() { return numConta; }
    public void setNumConta(int numConta) { this.numConta = numConta; }

    // Métodos
    public int extrato() {
        return saldo;
    }

    public void saque(int val) {
        saldo -= val;
    }

    public void deposito(int val) {
        saldo += val;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome +
               "\nCPF: " + cpf +
               "\nConta: " + numConta +
               "\nSaldo: " + saldo;
    }
}

class Banco {
    private Cliente[] clientes = new Cliente[2];

    public Cliente[] getClientes() {
        return clientes;
    }

    public Cliente[] cadastraClientes() {
        Cliente c1 = new Cliente("Alan Turing", "1289", 1500, 25896);
        Cliente c2 = new Cliente("Ada Love", "98765431", 12345);

        clientes[0] = c1;
        clientes[1] = c2;

        return clientes;
    }

    public String operacoes() {
        for (Cliente c : clientes) {
            c.saque(100);
            c.deposito(50);

            if (c.getSaldo() < 0) {
                c.setSaldo(0);
            }
        }

        clientes[1].setNome("Ada Lovelace");
        clientes[0].setCpf("12345689");

        return clientes[0].toString() + "\n" + clientes[1].toString();
    }
}

public class q2 {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.cadastraClientes();
        System.out.println(banco.operacoes());
    }
}
