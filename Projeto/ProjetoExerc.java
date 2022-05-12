package Projeto;


import javax.swing.JOptionPane;

/**
 *
 * @author Paulo
 */
public class ProjetoExerc {

    public static void main(String[] args) {
        String nomeUsuario =  JOptionPane.showInputDialog("Digite seu nome");
        
        String idadeString = JOptionPane.showInputDialog("Qual sua idade?");
        int idade = Integer.parseInt(idadeString);
        
        String alturaString = JOptionPane.showInputDialog("Qual sua altura?");
        double altura = Double.parseDouble(alturaString);

        String alturaString = JOptionPane.showInputDialog("Qual sua altura?");
        double altura = Double.parseDouble(alturaString);
        
        
        
        
        JOptionPane.showMessageDialog (null,"Meu nome é "+ nomeUsuario + " e tenho " + idade +" anos de idade.\nTenho " + altura + " de altura.","Resposta",2);
        
        
    }
}
