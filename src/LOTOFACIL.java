import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class LOTOFACIL {
    public static void menu() throws IOException {
        int input;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("****************************************************************");
            System.out.println("Menu LOTOFÁCIL:");
            System.out.println("1) Apostar de 0 a 100\n2) Apostar de A à Z\n3) Apostar em par ou ímpar\n0) Sair");
            System.out.println("****************************************************************");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    apostaNum();
                    break;
                case 2:
                    apostaLetra();
                    break;
                case 3:
                    apostaParImpar();
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (input != 0);
        sc.close();
    }

    public static void apostaNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número entre 1 a 100: ");
        int valor = sc.nextInt();
        Random rdm = new Random();
        int sorteio = rdm.nextInt(100);
        System.out.println(sorteio);
        if (valor >= 0 && valor <= 100) {
            if (valor == sorteio) System.out.println("Você ganhou R$ 1.000,00 reais.");
            else System.out.println("Que pena! O número sorteado foi: " + sorteio);
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public static void apostaLetra() throws IOException {
        char letraPremiada = 'L';
        System.out.println("Digite uma letra de A a Z: ");
        char letra = (char) System.in.read();
        if (Character.isLetter(letra)) {
            if (Character.toUpperCase(letra) == letraPremiada) System.out.println("Você ganhou R$ 500,00 reais.");
            else System.out.println("Que pena! A letra sorteada foi: " + letraPremiada);
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public static void apostaParImpar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número par ou impar: ");
        int valor = sc.nextInt();
        Random rdm = new Random();
        int sorteio = rdm.nextInt(2);
        if (valor % 2 == sorteio) {
            System.out.println("Você ganhou R$ 1.000,00 reais.");
        } else {
            if (sorteio == 1)
                System.out.println("Que pena! O número digitado é par e a premiação foi para números ímpares.");
            else System.out.println("Que pena! O número digitado é impar e a premiação foi para números pares.");
        }
    }

    public static void main(String[] args) throws IOException {
        menu();
    }
}
