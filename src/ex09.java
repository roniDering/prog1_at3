package atividade_3;
import java.util.Scanner;

/*
9. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro
entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve
ser conforme o exemplo abaixo:
• Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50


*/

public class ex09{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

         System.out.println("Informe um número");
         int num = s.nextInt();
         
         for (int i = 1; i < 11; i++) {
             System.out.println(num+" x "+i+" = "+i*num);
        }
    }    
}
