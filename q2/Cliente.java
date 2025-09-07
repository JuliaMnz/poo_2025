package q2;

public class Cliente {
    String nome;
    String cpf;
    int saldo;
    int numConta;

    public Cliente(String nome, String cpf, int saldo, int numConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numConta = numConta;
    }

    public Cliente(String nome, String cpf, int numConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0;
        this.numConta = numConta;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int extrato() {
        return this.saldo;
    }

    public void saque(int val) {
        if (this.saldo >= val) {
            this.saldo -= val;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void deposito(int val) {
        this.saldo += val;
    }

    public String toString() {
        return "Cliente: " + nome +
                "\nCpf: " + cpf +
                "\nConta: " + numConta +
                "\nSaldo: " + saldo + "\n";
    }
}
