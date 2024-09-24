/*
*2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
* */
import java.util.Scanner;

public class DesafioDois {
    public static void main(String[] args) {
        //chama o metodo scanner para receber informacao do usuario.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Converte a string para minúscula para contar cada 'a' presentes na frase.
        String lowerCaseInput = frase.toLowerCase();
        int repeticaoA = 0;

        // Conta quantas vezes 'a' aparece na string.
        for (int i = 0; i < lowerCaseInput.length(); i++) {
            if (lowerCaseInput.charAt(i) == 'a') {
                repeticaoA++;
            }
        }
        // Imprime a quantidade de vezes que se repete a letra 'a'.
        if (repeticaoA > 0) {
            System.out.println("A letra 'a' aparece " + repeticaoA + " vezes.");
        } else {
            System.out.println("A letra 'a' não foi encontrada.");
        }
    }
}
