//Crie um programa Java que imprima a tabuada de multiplicação de um número inteiro lido 
//pelo teclado durante a sua execução. Assim, por exemplo, se o usuário informar ‘7’, 
//deve imprimir: 1 x 7 = 7; 2 x 7 = 14; …; 10 x 7 = 70. Use um laço for contado.

package naty.exerciciosfixacaopooii;

import java.util.Scanner;


public class Ex04 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int numero = leitor.nextInt();
        
        System.out.println("Tabuada do: " + numero);
        
        for(int i = 0; i <= 10 ; i++){
            
            int resul;
            resul = numero*i;
            
            System.out.println(numero + " x " + i + " = " + resul);
            
        }
    }
    
}
