
package br.newtonpaiva;

import java.io.IOException;

public class Aula02 {
    public static void main(String[] args) throws IOException {
        System.out.println("Olá, mundo!");

        asterisco();

        char ch;
        ch = 'X';
        System.out.println("ch contains " + ch);
        ch++;
        System.out.println("ch is now " + ch);
        ch = 90;
        System.out.println("ch is now " + ch);

        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807L;
        boolean tipoBooleano = true;
        System.out.println("Valor do tipoByte = " + tipoByte);
        System.out.println("Valor do tipoShort = " + tipoShort);
        System.out.println("Valor do tipoChar = " + tipoChar);
        System.out.println("Valor do tipoFloat = " + tipoFloat);
        System.out.println("Valor do tipoDouble = " + tipoDouble);
        System.out.println("Valor do tipoInt = " + tipoInt);
        System.out.println("Valor do tipoLong = " + tipoLong);
        System.out.println("Valor do tipoBooleano = " + tipoBooleano);

        asterisco();

        System.out.println("\nFirst line\nSecond line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF");

        asterisco();

        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);
        if (b) System.out.println("This is executed!");
        b = false;
        if (b) System.out.println("This is not executed!");
        System.out.println("10 > 9 is " + (10 > 9));

        asterisco();

        int count = 10;
        char chr = 'X';
        float f = 1.2F;

        int y = 8, z = 19;
//        int x; int w;
        System.out.println(y + z);

        double radius = 4, height = 5;
        double volume = 3.1416 * radius * radius * height;
        System.out.println("\nVolume is " + volume);

        asterisco();

        int m;
        m = 10;
        if (m == 10) {
            int n = 20;
            System.out.println("m and n: " + m + " " + n);
            m = n * 2;
        }
//        n = 100; // variavel de escopo local
        System.out.println("m is " + m);

        for (int i = 0; i < 3; i++) {
            int j = -1;
            System.out.println("j is: " + j);
            j = 100;
            System.out.println("j is now: " + j);
        }

        asterisco();

        int iresult, irem;
        double dresult, drem;
        iresult = 10 / 3;
        irem = 10 % 3;
        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;
        System.out.println("\nResult and remainder of 10 / 3: " + iresult + " " + irem);
        System.out.println("\nResult and remainder of 10.0 / 3.0: " + dresult + " " + drem);

        asterisco();


        int i, j;
        boolean b1, b2;
        i = 10;
        j = 11;
        if (i < j) System.out.println("\ni < j");
        if (i <= j) System.out.println("\ni <= j");
        if (i != j) System.out.println("\ni != j");
        if (i == j) System.out.println("this won't execute");
        if (i >= j) System.out.println("this won't execute");
        if (i > j) System.out.println("this won't execute");

        b1 = true;
        b2 = false;
        if (b1 & b2) System.out.println("this won't execute");
        if (!(b1 & b2)) System.out.println("!(b1 & b2) is true");
        if (b1 | b2) System.out.println("b1 | b2 is true");
        if (b1 ^ b2) System.out.println("b1 ^ b2 is true");

        asterisco();

        int n, d, g;
        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0) {
            System.out.println(d + " is a factor of " + n);
        }
        d = 0;
        if (d != 0 && (n % d) == 0) {
            System.out.println(d + " is a factor of " + n);
        }
        System.out.println("Passou\n");
//        if (d != 0 & (n % d) == 0) {
//            System.out.println(d + " is a factor of " + n);
//        }
        System.out.println("Não passou\n");

        asterisco();

        char chh;
        for (int t = 0; t < 10; t++) {
            chh = (char) ('a' + t);
            System.out.println(chh);
            chh = (char) ((int) chh & 65503);
            System.out.println(chh + " ");
        }

        asterisco();

        int x = 5;
        int resultado = ++x;
        System.out.println("\nx: " + x);
        System.out.println("resultado: " + resultado);

        x = 5;
        resultado = x++;
        System.out.println("\nx: " + x);
        System.out.println("resultado: " + resultado);

        asterisco();

        char chx;
        System.out.println("\nPress a key followed by ENTER: ");
        chx = (char) System.in.read();
        System.out.println("Your key is: " + chx);

        asterisco();

        char chxy, answer = 'A';
        System.out.println("\nI'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it: ");
        chxy = (char) System.in.read();
        if (chxy == answer) System.out.println("** Right **");
        else System.out.println("... Sorry, you're wrong.");

        asterisco();

        int numero = 10;
        String result = (numero % 2 == 0) ? "par" : "impar";
        System.out.println("O número " + numero + " é " + result + ".");

        asterisco();

        enum DiaDaSemana {
            SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
        }

        DiaDaSemana dia = DiaDaSemana.QUARTA;

        switch (dia) {
            case SEGUNDA:
            case TERCA:
            case QUARTA:
            case QUINTA:
            case SEXTA:
                System.out.println("Dia do trabalho!");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println("Final de semana.");
                break;
        }

        asterisco();

        double num, sroot, rerr;
        for(num = 1.0; num < 100.0; num++){
            sroot = Math.sqrt(num);
            System.out.println("Square root of " + num + " is " + sroot);
            rerr = num - (sroot + sroot);
            System.out.println("Rounding error is " + rerr);
            System.out.println();
        }

        asterisco();

        for(i = 0, j = 10; i < j; i++, j--){
            System.out.println("i and j: " + i + " " + j);
        }

        asterisco();

        System.out.println("Press S to stop");
        for(i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Pass #" + i);
        for(i = 0; i < 10;) {
            System.out.println("Pass #" + i);
            i++;
        }

        asterisco();

        int sum = 0;
        for(i = 1; i <= 5; sum += i++);
        System.out.println("sum is " + sum);
    }

    public static void asterisco(){
        System.out.println("*****************************************************************");
    }
}
