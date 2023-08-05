package br.senai.sp.form;

import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.Scanner;

public class form {

    public void formulario () {
        /**
         * Import class Scanner
         */
        Scanner teclado = new Scanner(System.in);


        /** Coleta dados do User */
        System.out.println("Bom dia !!!");

        System.out.print("Qual é o seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Qual a sua idade: ");
        int idade = teclado.nextInt();

        System.out.print("Qual seu peso: ");
        int peso = teclado.nextInt();

        System.out.print("Qual sua altura: ");
        float altura = teclado.nextFloat();

        System.out.print("Qual seu rg: ");
        int rg = teclado.nextInt();

        System.out.print("Qual seu CPF: ");
        long cpf = teclado.nextLong();

        System.out.print("Qual é a sua profissão: ");
        String profissao = teclado.next();

        System.out.print("Qual é o seu curso: ");
        String curso = teclado.next();


        /** Printa as Informações */

        System.out.println("---------------------------------------------");
        System.out.println("--------------- Formulario ------------------\n");
        System.out.println("Olá Profs " + nome + " Sejam bem vindos !! ");
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu peso é: " + peso);
        System.out.println("Sua altura é: " + altura);
        System.out.println("Seu RG: " + rg);
        System.out.println("Seu CPF: " + cpf);
        System.out.println("Sua Profissão: " + profissao);
        System.out.println("Seu curso é: " + curso);
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");


        //        String [] nomes = new String[2];
        //
        //        System.out.println("Qual o nome do Prof 1 : ");
        //        nomes[0] = teclado.nextLine();
        //
        //        System.out.println("Qual o nome do Prof 2 : ");
        //        nomes[1] = teclado.nextLine();
        //
        //        System.out.println("Olá Prof°s: " + nomes[0] + " e " + nomes[1] + " Sejam bem vindos");
        //
    }
}


