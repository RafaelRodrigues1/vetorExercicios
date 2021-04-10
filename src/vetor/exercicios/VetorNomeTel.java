package vetor.exercicios;

import java.util.Scanner;

/**
 *
 * @author RAFAEL
 */
public class VetorNomeTel {

    /**Faça um programa de consulta de telefones a partir de um 
     * nome informado por uma chave de dados: leia nomes de pessoas 
     * com seus respectivos telefones, sendo a quantidade determinada 
     * pelo usuário. Em seguida pergunte ao usuário qual o nome que ele 
     * deseja consultar o telefone. Após sua resposta, exiba o telefone da pessoa procurada.
     * Informe também se o nome é inexistente no banco de dados.
     */
    public static void main(String[] args) {
        
        System.out.print("Deseja cadastrar quantas pessoas? ");
        int n = new Scanner(System.in).nextInt();
        String nomeTele[][] = new String[n][2];      
        for(int i=0; i<nomeTele.length; i++){
            System.out.print("Digite o nome: ");
            nomeTele[i][0] = new Scanner(System.in).next();
            System.out.print("Digite o número: ");
            nomeTele[i][1] = new Scanner(System.in).next();
        }
        String consulta = new String();
        consulta1:
        do{
            System.out.print("Digite o nome do cadastrado para consulta de telefone(0 para interromper): ");
            consulta = new Scanner(System.in).next();
            for(int i=0; i<nomeTele.length; i++){
                if(nomeTele[i][0].equals(consulta)){
                    System.out.println("Cadastrado(a) " + nomeTele[i][0] + " N°"+ nomeTele[i][1]);
                    continue consulta1;
                }                              
            }  
            System.out.println("Nome não consta na base de dados, verifique se consultou corretamente.");             
        }while(!(consulta.equals("0")));
        System.out.println("Fim de consulta!");
    }  
    
}
