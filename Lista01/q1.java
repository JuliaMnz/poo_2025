import java.util.ArrayList;

class Filme {
    private String titulo;
    private String genero;
    private int anoLancamento;

    public Filme(String titulo, String genero, int anoLancamento) {
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    public Filme(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = 0;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; } 

    public int getAnoLancamento() { return anoLancamento; }
    public void setAnoLancamento(int anoLancamento) { this.anoLancamento = anoLancamento; }

    public String toString() {
        return "Título: " + titulo +
                " | Gênero: " + genero +
                " | Ano: " + (anoLancamento == 0 ? "Indefinido" : anoLancamento);
    }
}

class Locadora {
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

public class q1 {
    public static void main(String[] args) {
        Locadora locadora = new Locadora("CineTop");

        Filme f1 = new Filme("Matrix", "Ficção", 1999);
        Filme f2 = new Filme("O Poderoso Chefão", "Drama", 1972);
        Filme f3 = new Filme("Avatar", "Aventura"); // ano indefinido

        locadora.adicionarFilme(f1);
        locadora.adicionarFilme(f2);
        locadora.adicionarFilme(f3);

        locadora.listarFilmes();
    }
}