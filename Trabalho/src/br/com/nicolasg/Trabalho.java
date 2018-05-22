package br.com.nicolasg;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Trabalho {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int exerciseNumber = -1;
       while (exerciseNumber != 0) {
               
                exerciseNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite o movimento que deseja executar\r\n"+ 
                "01 - Cadastro de Produto\r\n"+
		"02 - Entrada\r\n"+
		"03 - Saida\r\n"+
                "04 - Saldo\r\n"+
                "05 - Relatório de Inventário\r\n"+
		"00 - Encerra"));
                
                
		System.out.println("");
                
                switch (exerciseNumber) {
                    case 1: CadastrodeProduto cadastro = new CadastrodeProduto();
                        break;
                        
                    case 2: Entrada entrada = new Entrada();
                        break;
                        
                    case 3: Saida saida = new Saida();
                        break;
                        
                    case 4: Saldo saldo = new Saldo();
                        break;
                        
                    case 5: Relatorio relatorio = new Relatorio();
                        break;
                        
                    case 0: System.out.println("Encerrando!");
			exerciseNumber = 0;
                        break;
                        
                    default: System.out.println("Movimento inválido!");
			break;
                        
                }
       }
    }
    
}
