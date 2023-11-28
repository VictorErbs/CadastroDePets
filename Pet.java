import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pet {
    private int codPet;
    private String chipPet;
    private String nomePet;
    private String dataNascPet;
    private String racaPet;

    private static List<Pet> listaPets = new ArrayList<>();

    public Pet(int codPet, String chipPet, String nomePet, String dataNascPet, String racaPet) {
        this.codPet = codPet;
        this.chipPet = chipPet;
        this.nomePet = nomePet;
        this.dataNascPet = dataNascPet;
        this.racaPet = racaPet;
    }

    public static void cadastrarPet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do pet:");
        int codPet = 0;
        if (scanner.hasNextInt()) {
            codPet = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner
        } else {
            System.out.println("Código inválido. O pet não será cadastrado.");
            return;
        }

        System.out.println("Digite o chip do pet:");
        String chipPet = scanner.nextLine();

        System.out.println("Digite o nome do pet:");
        String nomePet = scanner.nextLine();

        System.out.println("Digite a data de nascimento do pet:");
        String dataNascPet = scanner.nextLine();

        System.out.println("Digite a raça do pet:");
        String racaPet = scanner.nextLine();

        Pet novoPet = new Pet(codPet, chipPet, nomePet, dataNascPet, racaPet);
        listaPets.add(novoPet);

        System.out.println("Pet cadastrado com sucesso!");
    }

    public static void mostrarPetsCadastrados() {
        if (listaPets.isEmpty()) {
            System.out.println("Nenhum pet cadastrado.");
        } else {
            System.out.println("Pets cadastrados:");
            for (Pet pet : listaPets) {
                System.out.println("Código: " + pet.getCodPet());
                System.out.println("Chip: " + pet.getChipPet());
                System.out.println("Nome: " + pet.getNomePet());
                System.out.println("Data de Nascimento: " + pet.getDataNascPet());
                System.out.println("Raça: " + pet.getCodPet());
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar pet");
            System.out.println("2 - Mostrar pets cadastrados");
            System.out.println("0 - Sair");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer do scanner
            } else {
                System.out.println("Opção inválida. Tente novamente.");
                scanner.nextLine(); // Limpa o buffer do scanner
                continue;
            }

            switch (opcao) {
                case 1:
                    cadastrarPet();
                    break;
                case 2:
                    mostrarPetsCadastrados();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            System.out.println();
        } while (opcao != 0);
    }

    public int getCodPet() {
        return codPet;
    }

    public void setCodPet(int codPet) {
        this.codPet = codPet;
    }

    public String getChipPet() {
        return chipPet;
    }

    public void setChipPet(String chipPet) {
        this.chipPet = chipPet;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getDataNascPet() {
        return dataNascPet;
    }

    public void setDataNascPet(String dataNascPet) {
        this.dataNascPet = dataNascPet;
    }

    public String getRacaPet() {
        return racaPet;
    }

    public void setRacaPet(String racaPet) {
        this.racaPet = racaPet;
    }

    public static List<Pet> getListaPets() {
        return listaPets;
    }

    public static void setListaPets(List<Pet> listaPets) {
        Pet.listaPets = listaPets;
    }

}
    
