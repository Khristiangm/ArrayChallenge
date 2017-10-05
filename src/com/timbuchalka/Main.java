package com.timbuchalka;

import org.omg.CORBA.INTERNAL;

import java.awt.font.FontRenderContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    //Classe responsavel por coletar dados digitados pelo usuario
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        //Declaração da variavel myIntegers que sera um Array e vai receber os valores do metodo getIntegers. Informando que ele tera 5 posições para guardar numeros do tipo Integer
        Integer[] myIntegers = getIntegers(5);

        //Printando na tela um tratamento para diferenciar os numeros em ordem aleatoria e os em ordem decrescente.
        System.out.println("-----------------------------------------");
        System.out.println("The Numbers Typed Was:");
        System.out.println("-----------------------------------------");

        //Chamando o metodo printArray para mostrar os 5 numeros setados pelo usuario
        printArray(myIntegers);

        //Metodo criado para organizar os numeros embaralhados digitados pelo usuario e deixa-los em ordem descrescente...
        sortIntegers(myIntegers);

        //Printando na tela um tratamento para diferenciar os numeros em ordem aleatoria e os em ordem decrescente .
        System.out.println("-----------------------------------------");
        System.out.println("The sorted numbers in Descending order:");
        System.out.println("-----------------------------------------");
        //Chamando o metodo novamente para exibir os numeros digitados na ordem decrescente.
        printArray(myIntegers);

    }
    //Metodo Criado para receber os numeros digitados pelo usuario e guardar em um array de Integer.
    public static Integer[] getIntegers(Integer number) {

        //Mensagem indicando ao usuario e o induzindo a digitar a quantidade de numeros solicitados
        System.out.println("Element " + number + " integer Values.\r");

        //Nesta linha estou declarando uma array de Integer com o nome values que vai receber o numero de slots relacionados ao numero digitado..
        Integer[] values = new Integer[number];

        //Estrutura de repetição criada para percorrer os arrays e ir guardando os respectivos numeros digitados enquanto o valor nao ultrapassar o numero de espaços criados.
        for (Integer i = 0; i < values.length; i++) {
            System.out.println("Type the " + i + " number");
            //Aqui ele scaneia o numero digitado e guarda dentro do array [i] que esta percorrendo no momento.
            values[i] = scanner.nextInt();
        }
        // e no final disso tudo o metodo me retorna oque foi armazenado dentro do values
        return values;
    }

    //Metodo Criado para organizar os numeros digitados e deixa-los em ordem decrescente..
    public static Integer[] sortIntegers(Integer[] sortingArray) {
        //A forma utilizada das classes do proprio java para organizar os numeros, por padrao o java organiza de forma crescente e o collections tem a funcao de inverter essa organizacao.
        Arrays.sort(sortingArray, Collections.reverseOrder());
        //e aqui retorna organizado.
        return sortingArray;
    }
    //Metodo Criado para printar na tela, independente do que seja.
    public static void printArray(Integer[] numberArray) {
        for (int i = 0; i < numberArray.length; i++) {

            System.out.println("typed number in position " + i + " Was " + numberArray[i]);
        }
    }
}
