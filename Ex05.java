//Crie um programa Java que leia 2 números pelo teclado e imprima o maior deles na tela, 
//usando apenas métodos de classes do Java, sem nenhuma estrutura condicional.

package naty.exerciciosfixacaopooii;

import java.util.Scanner;

public class Ex05 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
    
        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();
        
        System.out.println("Maior número: " + Math.max(num1, num2));
    }
    
}
