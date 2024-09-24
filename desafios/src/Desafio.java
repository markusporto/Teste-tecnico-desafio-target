import java.util.Scanner;

/*1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

*/
public class Desafio {

    //logica de calculo para numeros Fibonacci.
    static long fibo (int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // recebe o numero a ser verificado
        System.out.println("Digite um numero: ");
        int num= scanner.nextInt();

        boolean fibonacci = false;
    // verifica se o numero coletado e Fibonacci.
        for (int i = 0; i < 30 ; i++) {
            long fib = Desafio.fibo(i);
            if (num == fib){
                fibonacci = true;
                break;
            }

        }
    // Imprime o resultado
        if (fibonacci) {
            System.out.println(num + ": E um numero Fibonacci");
        } else {
            System.out.println(num + ": Nao e um numero Fibonacci");
        }
        }
    }
