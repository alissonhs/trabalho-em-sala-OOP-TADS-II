package br.com.nicolasg;

import javax.swing.JOptionPane;

class Saida {
    float valordesc; 
    float percent = 1.5f;  
    float valorsaida; 
    int[] quantidade; 
    String[] produtos; 
    

    
    public Saida(){
      
        while (true){
        
        int proce;
        proce = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para realizar venda, \r\n 2 para sair."));
        
        this.produtos = new String [100]; 
        
        if (proce == 1){
        for (int i=0; i<=100; i++){
            
            produtos[i] = JOptionPane.showInputDialog("Digite o Produto desejado"); 
        
            quantidade[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada")); 
          }
        
            this.calcula();
        }
        else {
            
            JOptionPane.showMessageDialog(null, "Venda cancelada");
            
           // return false; 
        }
        
        
      }   
        
    }
    
    
    public void calcula(){
     
      valordesc = valorsaida * percent;
      valorsaida = valorsaida - valordesc; 
        
    }
    
}
