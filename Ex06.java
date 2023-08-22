//Refaça o exercício anterior utilizando: 
//a) estrutura condicional if-else; b) operador condicional ternário.

package naty.exerciciosfixacaopooii;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        //if-else
        Scanner leitor = new Scanner(System.in);
    
        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();
        
        System.out.println("O maior número é:");
        if(num1 > num2){
            System.out.println(num1);
        }
        else{
            System.out.println(num2);
        }
        
        //operador condicional ternário
        //num1 > num2 ? System.out.println(num1) : System.out.println(num2);
        
        System.out.println(( num1 > num2 ) ? num1 : num2 );
        

    }
       
}
