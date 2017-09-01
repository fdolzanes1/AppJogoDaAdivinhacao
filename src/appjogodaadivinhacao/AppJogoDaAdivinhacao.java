/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjogodaadivinhacao;

import javax.swing.JOptionPane;

/**
 *
 * @developer Fabiano
 */
public class AppJogoDaAdivinhacao {

    public void dica(int palpite, int numero, int tentativas){
        if(palpite > numero){
            System.out.println("Dica: O número sorteado é MENOR");
            JOptionPane.showMessageDialog(null, "Dica: O número sorteado é MENOR");
        } else {
            if(palpite < numero){
                    System.out.println("Dica: O número sorteado é MAIOR");
                    JOptionPane.showMessageDialog(null, "Dica: O número sorteado é MAIOR");
            } else {
                System.out.println("Parabéns, você acertou! O número era " + numero);
                System.out.println("Você tentou " + tentativas + " vezes antes de acertar!");
                JOptionPane.showMessageDialog(null, "Parabéns, você acertou! O número era " + numero);
                JOptionPane.showMessageDialog(null, "Você tentou " + tentativas + " vezes antes de acertar!");
            }
        }   
    }
    
}
