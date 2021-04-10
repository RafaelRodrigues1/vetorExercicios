package vetor.exercicios;

import java.util.Scanner;

/**
 *
 * @author RAFAEL
 */
public class VetorSalarios {

    /**4.Leia um conjunto de salários, sendo que para terminar a entrada será
     * fornecido o valor -1. Após toda a entrada ter sido realizada, leia o valor de um reajuste. 
     *Em seguida exiba todos os salários já reajustados.     
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Número total de funcionários: ");
        int f = input.nextInt();
        Double salBase[] = new Double[f];
        Double salReaj[] = new Double[f];
        double reajuste;
        int i = 0;                 
        while(i<salBase.length){ 
            System.out.print("Insira o salário do funcionário " + (i+1) + ": R$");
            salBase[i] = Double.parseDouble(input.next());
            i++;}    
        System.out.print("Digite o valor do reajuste(em %): ");
        reajuste = Double.parseDouble(input.next());
        for(i=0; i<salReaj.length; i++){
            salReaj[i] = salBase[i]+(salBase[i]*reajuste/100);
        }
        i=1;
        for(double valor: salReaj){
            System.out.println("Salário reajustado do funcionário " + i + ": R$" + valor);
            i++;
        }
        
    }
    
}
