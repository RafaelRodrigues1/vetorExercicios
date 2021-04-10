package vetor.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author RAFAEL
 */
public class VetorNotas {
    /*Leia um conjunto de notas, cuja quantidade seja determinada pelo usuário. 
    Calcule a média de todas elas. Exiba o conjunto das notas maiores do que a média calculada. 
    Em seguida, de forma agrupada, exiba o outro conjunto de notas (menores do que a média).*/
    
    public static void main(String[] args) {
        
        int quant =  Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas notas deseja inserir? "));
        Double notas[] = new Double[quant];
        double soma=0, media;
        for(int i = 0; i<notas.length; i++){
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota"));
            soma += notas[i]; 
        }
        media = soma/notas.length;
        System.out.println("Média = " + media);
        JOptionPane.showMessageDialog(null, "A média foi: " + media, "Média", 1);
        String acima = "As notas iguais ou acima da média foram ", abaixo = "As notas abaixo da média foram ";        
        for(double valor: notas){           
            if(valor>=media){
                acima += valor + "  ";
            }else if(valor<media){
                abaixo += valor + "  ";
            }
        }
        System.out.println(acima);
        System.out.println(abaixo);
        JOptionPane.showMessageDialog(null, acima, "Acima da média", 1);
        JOptionPane.showMessageDialog(null, abaixo, "Abaixo da média", 1);
    }   
}
