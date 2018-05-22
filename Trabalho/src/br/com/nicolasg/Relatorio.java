package br.com.nicolasg;

import javax.swing.JOptionPane;

class Relatorio {

    public Relatorio(){
        CadastrodeProduto cp = new CadastrodeProduto();
        JOptionPane.showMessageDialog(null,"Produtos em Estoque");
        Produto[] produto = cp.getProduto();
        for (int i = 0; i < 100; i++) {
        JOptionPane.showMessageDialog(null, produto[i].getNome()+""+produto[i].getValor());
        }
        
    }
}