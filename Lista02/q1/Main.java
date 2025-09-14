package Lista02.q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Zoo zoo = new Zoo();
        long idCounter = 1;

        while (true) {
            System.out.println("\n===== MENU ZOOLÓGICO =====");
            System.out.println("1. Adicionar animal");
            System.out.println("2. Listar todos os animais");
            System.out.println("3. Remover animal (por ID)");
            System.out.println("4. Emitir som de um animal (por ID)");
            System.out.println("5. Testar habilidade de um animal (por ID)");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Qual animal deseja adicionar? (1=Cat, 2=Dog, 3=Bird)");
                    int tipo = sc.nextInt();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    System.out.print("Peso: ");
                    double peso = sc.nextDouble();

                    Animal animal = null;
                    if (tipo == 1) animal = new Cat(idCounter, idade, peso);
                    else if (tipo == 2) animal = new Dog(idCounter, idade, peso);
                    else if (tipo == 3) animal = new Bird(idCounter, idade, peso);

                    if (animal != null) {
                        zoo.addAnimal(animal);
                        System.out.println("Animal adicionado com ID: " + idCounter);
                        idCounter++;
                    }
                    break;

                case 2:
                    System.out.println("=== Lista de Animais ===");
                    for (Animal a : zoo.listAnimals()) {
                        System.out.println(a);
                    }
                    break;

                case 3:
                    System.out.print("Digite o ID do animal para remover: ");
                    long idRemove = sc.nextLong();
                    boolean removed = zoo.removeAnimal(idRemove);
                    System.out.println("Animal removido: " + removed);
                    break;

                case 4:
                    System.out.print("Digite o ID do animal: ");
                    long idSom = sc.nextLong();
                    Animal aSom = zoo.getAnimalById(idSom);
                    if (aSom != null) {
                        System.out.println(aSom.sound());
                    } else {
                        System.out.println("Animal não encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("Digite o ID do animal: ");
                    long idHab = sc.nextLong();
                    sc.nextLine(); // limpar buffer
                    System.out.print("Digite a habilidade a testar: ");
                    String hab = sc.nextLine();
                    Animal aHab = zoo.getAnimalById(idHab);
                    if (aHab != null) {
                        System.out.println(aHab.performAbility(hab));
                    } else {
                        System.out.println("Animal não encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Saindo do programa...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
