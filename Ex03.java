//Crie um programa Java que leia a partir do teclado um valor de cada tipo nativo 
//e um valor String, cada qual em variável própria, e, em seguida, imprima-os na tela.

package naty.exerciciosfixacaopooii;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
    
    byte a;
    short b;
    int c;
    long d;
    boolean e;
    char f;
    float g; 
    double h;
    
    a = ler.nextByte();
    b = ler.nextShort();
    c = ler.nextInt();
    d = ler.nextLong();
    e = ler.nextBoolean();
    f = ler.next().charAt(0);
    g = ler.nextFloat();
    h = ler.nextDouble();
    
    System.out.println(a + b + c + d + f + g + h);
    
    }
}
