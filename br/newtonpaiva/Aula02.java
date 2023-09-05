
package br.newtonpaiva;

import java.io.IOException;
public class Aula02 {
    public static void main(String[] args) throws IOException {
        System.out.println("Olá, mundo!");
        
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

        System.out.println("\nFirst line\nSecond line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF");

        boolean b;
        b= false;
        System.out.println("b is " + b);
        b= true;
        System.out.println("b is " + b);
        if(b) System.out.println("This is executed!");
        b = false;
        if(b) System.out.println("This is not executed!");
        System.out.println("10 > 9 is " + (10 > 9));

        int count = 10;
        char chr = 'X';
        float f = 1.2F;

        int x, y = 8, z = 19, w;

        System.out.println(x + y + z + w);

    }
}
