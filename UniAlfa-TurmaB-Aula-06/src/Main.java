import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        validarIdadeDoUsuario();
        System.out.println("Seja Bem Vindo");
        Scanner objetoDeLeitura = new Scanner(System.in);
        validarIdadeDoUsuario();




    }

    private static void validarIdadeDoUsuario() {
        System.out.println("Seja Bem Vindo");
        Scanner objetoDeLeitura = new Scanner(System.in);
        validarIdadeDoUsuario();
        
        System.out.println("Qual seu nome?");
        String nome = objetoDeLeitura.nextLine();

        System.out.println("Qual sua idade?");
        int idade = objetoDeLeitura.nextInt();

        if (idade >= 60) {
            System.out.println("Oi " + nome + " você já é Senior!");

        } else if (idade >= 18) {
            System.out.println("Oi " + nome + " você é maior de idade!");
        } else {
            System.out.println("Oi " + nome + " você é menor de idade!");
        }
    }
}

