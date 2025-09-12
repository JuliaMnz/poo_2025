public class LocadoraEstoque {
    public static void main(String[] args) {
        Locadora locadora = new Locadora("CineTop");

        Filme f1 = new Filme("Matrix", "Ficção", 1999);
        Filme f2 = new Filme("O Poderoso Chefão", "Drama", 1972);
        Filme f3 = new Filme("Avatar", "Aventura"); 

        locadora.adicionarFilme(f1);
        locadora.adicionarFilme(f2);
        locadora.adicionarFilme(f3);

        locadora.listarFilmes();
    }
}
