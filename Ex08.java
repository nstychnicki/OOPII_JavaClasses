//Crie um programa Java que peça ao usuário um número inteiro correspondente à sua preferência 
//de comida para o próximo almoço. Use uma estrutura switch-case para imprimir os pratos escolhidos 
//segundo a tabela: (1, salada), (2, arroz e feijão), (3, espaguete ao sugo), (4, misto quente), 
//(5, misto frio), (6, arroz e ovo frito), (<qualquer outro valor>, “Prato indisponível”).

package naty.exerciciosfixacaopooii;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ex08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        JOptionPane.showMessageDialog(null, "1 - salada \n 2 - arroz e feijão \n 3 - espaguete ao sugo "
                + "\n 4 - misto quente \n 5 - misto frio \n 6 - arroz e ovo frito \n" );
        
        int escolha = leitor.nextInt();
        
        switch (escolha) {
            case 1:
                System.out.println("Você escolheu: Salada");
                break;
            case 2:
                System.out.println("Você escolheu: Arroz e feijão");
                break;
            case 3:
                System.out.println("Você escolheu: Espaguete ao sugo");
                break;
            case 4:
                System.out.println("Você escolheu: Misto quente");
                break;
            case 5:
                System.out.println("Você escolheu: Misto frio");
                break;
            case 6:
                System.out.println("Você escolheu: Arroz e ovo frito");
                break;
            default:
                System.out.println("Prato indisponível");
        } 
    }
}
