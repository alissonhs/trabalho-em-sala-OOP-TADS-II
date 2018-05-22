package br.com.nicolasg;

import javax.swing.JOptionPane;

class Entrada{

public Entrada(){


        String produto[];
        produto = new String[1];
        for (int i = 0; i < produto.length; i++) {
            produto[i] = JOptionPane.showInputDialog("Informe o Produto");        
            System.out.println(produto[i]);
        }
        int quant[] = new int[10];
        for (int i = 0; i < produto.length; i++) {
            produto[i] = JOptionPane.showInputDialog("Informe a Quantidade!");        
            System.out.println(produto[i]);
        }
        JOptionPane.showMessageDialog(null,"Entrada Registrada!");
    
    
}
}