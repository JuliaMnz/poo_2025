

import java.util.ArrayList;

public class Locadora {
    private String nome;
    private ArrayList<Filme> filmes;

    public Locadora(String nome) {
        this.nome = nome;
        this.filmes = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    public void listarFilmes() {
        System.out.println("Filmes da locadora " + nome + ":");
        for (Filme f : filmes) {
            System.out.println(f);
        }
    }
}
