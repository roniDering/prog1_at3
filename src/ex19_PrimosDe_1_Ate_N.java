package atividade_3;

import java.util.Scanner;

/*
19. Faça um programa que mostre todos os primos entre 1 e N sendo N um número inteiro
fornecido pelo usuário. O programa deverá mostrar também o número de divisões que ele
executou para encontrar os números primos.

 */
public class ex19_PrimosDe_1_Ate_N {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("numero");
        int num = s.nextInt();

        int contDiv = 0;

        for (int i = 1; i <= num; i++) {  //laco q vai do numero até 1

            int verificacao = 0; 

            for (int j = 1; j <= i; j++){   //laco que testa todas as divisoes
                contDiv++;
                if ((i % j) == 0) {   //verifica se é primo
                    verificacao++;   //só pode ter 2, o 1 e ele mesmo se for mais q 2 nao é primo

                }
            } //fim laço secundario

            System.out.println("-----");
            if (verificacao!=2 ) {  // se for (>2) o 1 entra junto e nao pode
                System.out.println("o numero: " + i + " nao é primo");

            } else {
                System.out.println("o numero: " + i + " é primo ++++++++++ ");

            }
        }//fim laco principal
        System.out.println("");
        System.out.println("Foi feitas "+contDiv+" divisoes");
    }
}
