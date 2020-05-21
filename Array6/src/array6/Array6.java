/*
6.Faça um Programa que peça as quatro notas de 3 alunos, calcule e
armazene num vetor a média de cada aluno, imprima o número de alunos
com média maior ou igual a 7.0.
 */
package array6;

import java.util.Scanner;

/**
 *
 * @author Felipe Lambiazzi
 */
public class Array6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        
        int n1[] = new int[5];
        int n2[] = new int [5];
        int n3[] = new int [5];
        int soma = 0, j =0;
        int med1 = 0, med2=0,med3=0;

        for (int i = 0; i < 4; i++) {
        System.out.printf("Digite a %d nota do 1º aluno ", (i+1));
        n1[i] = ler.nextInt();
        soma += n1[i];
        if (i==4)
            med1= soma/4;
        
        n1[4] = med1 ;
        if (med1 >=7) j++;
           
        }
        for (int i = 0; i < 4; i++) {
           
        System.out.printf("Digite a %d nota do 2º aluno ", (i+1));
        n2[i] = ler.nextInt();
        soma += n2[i];
        if (i==4)
            med2= soma/4;
        
        n2[4] = med2 ;
           if (med2 >=7)j++;
            
        }
        for (int i = 0; i < 4; i++) {
           
        System.out.printf("Digite a %d nota do 3º aluno ", (i+1));
        n3[i] = ler.nextInt();
        soma += n3[i];
        if (i==4)
            med3= soma/4;
        
        n3[4] = med3 ;
        
        if (med3 >=7)j++;
            
        }
        System.out.printf("A quantidade de alinos com notas acima de 7 é: "+j);
        System.out.printf("Primeiro Aluno %d"+n1[4]);
        System.out.printf("Segundo Aluno %d"+n2[4]);
        System.out.printf("Terceiro Aluno %d"+n3[4]);
    }
    
}
