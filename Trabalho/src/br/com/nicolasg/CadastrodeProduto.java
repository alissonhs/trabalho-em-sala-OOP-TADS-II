package br.com.nicolasg;

import javax.swing.JOptionPane;

class CadastrodeProduto {
    
    private Produto[] produto;

    public Produto[] getProduto() {
        return produto;
    }

    public void setProduto(Produto[] produto) {
        this.produto = produto;
    }
    
    private int Estoque = 0;
    private int mov = -1;
        
    public CadastrodeProduto() {
        while (mov != 0){
            this.produto = new Produto[100];
            Produto p = new Produto();   
            String name = JOptionPane.showInputDialog("Informe a Descrição do Produto: ");
            p.setNome(name);
            float valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o Valor do Produto: "));
            p.setValor(valor);
            Estoque++;
            produto[Estoque] = p;
            System.out.println("Produto "+name+ " - Valor R$"+valor);
            
            mov = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar mais um produto?\r\n"+
                    "01 - Sim\r\n"+
                    "00 - Sair"));
            switch (mov) {
                case 1: mov = -1;
                    break;
                        
                case 0: System.out.println("Encerrando!");
                    mov = 0;
                    break;
                        
                default: System.out.println("Movimento inválido!");
                    break;
                        
                }
            
        }

    }
}