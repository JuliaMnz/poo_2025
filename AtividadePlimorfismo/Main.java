package AtividadePlimorfismo;

public class Main {
    public static void interagirComAnimais(Animal[] animais) {
        for (int i = 0; i < animais.length; i++) {
            animais[i].fazerSom();

            if (animais[i] instanceof Cachorro) {
                Cachorro cachorro = (Cachorro) animais[i];
                cachorro.abanarRabo();
            }
        }
    }
    
}
