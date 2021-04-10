package vetor.exercicios;

import java.util.Scanner;

/**
 *Leia um conjunto de nomes de pessoas. Exiba-os em ordem alfabética crescente.
 */
public class VetorNomesOrdem {

    
    public static void main(String[] args) {
        System.out.print("Quantos nomes deseja inserir? ");
        int a = new Scanner(System.in).nextInt();        
        String nome[] = new String[a];
        for(int i=0; i<nome.length; i++){
            System.out.print("Digite o nome da " + (i+1) + "° pessoa: ");
            nome[i] = new Scanner(System.in).next();
        }
        System.out.print("Esse é o vetor fora de ordem: ");
        for (String i : nome) {
            System.out.print(i + " ");
        }
        String aux;
        for(int i=0; i<nome.length-1; i++){
            for(int j=i+1; j<nome.length; j++){
                if(nome[i].compareTo(nome[j])>0){
                aux=nome[i];
                nome[i]=nome[j];
                nome[j]=aux;                
                }
            }
        }
        System.out.println("");
        System.out.print("Esse é o vetor na ordem: ");
        for(String i: nome){
            System.out.print(i + " ");
        }
    }
    
}
