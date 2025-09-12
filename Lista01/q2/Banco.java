package Lista01.q2;

public class Banco {
    Cliente clientes[] = new Cliente[2];

    public Cliente[] getClientes() {
        return clientes;
    }

    public void cadastraClientes() {
        Cliente c1 = new Cliente("Alan Turing", "1289", 1589, 0);
        Cliente c2 = new Cliente("Ada Love", "98765431", 12345, 0);

        clientes[0] = c1;
        clientes[1] = c2;

    }

    public String operacoes() {
        for (Cliente c : clientes) {
            c.saque(100);
        }

        for (Cliente c : clientes) {
            c.deposito(50);
        }

        for (Cliente c : clientes) {
            if (c.getSaldo() < 0) {
                c.setSaldo(0);
            }
        }

    clientes[1].setNome("Ada Lovelace");

    clientes[0].setCpf("123456789");

    String resultado = "";
        for (Cliente c : clientes) {
            resultado += c.toString() + "\n";
        }
        return resultado;
    }

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.cadastraClientes();
        System.out.println(banco.operacoes());
    }
}