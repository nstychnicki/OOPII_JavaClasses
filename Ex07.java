//Crie um programa Java que leia strings a partir do teclado, armazenando-as num array 
//(pesquise como criar arrays em Java) até que seja entrada uma linha de texto que termine 
//por “fim” (ex: “agora é o fim”, “acabou o texto. fim”, “fim”, …) ou que tenham sido 
//entradas 128 linhas. Use o método endsWith() da classe String e um dos laços não-contados 
//(while ou do-while). Finda a entrada de dados, imprima as linhas em ordem inversa.

package naty.exerciciosfixacaopooii;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String[] array = new String[128];
        int count = 0;
        String entrada;
        
        do {
            entrada = leitor.nextLine();
            if (!entrada.endsWith("fim") && count < 128) {
                array[count] = entrada;
                count++;
            }
        } while (!entrada.endsWith("fim") && count < 128);
       
        System.out.println("\nLinhas de texto em ordem inversa:");

        for (int i = count - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
