package com.desafio;

import java.io.*;

public class Escada {

    public static void questao1(){

        String titulo;
        String conteudoMensagem;
        String conteudoEntrada;
        String niveis;

        titulo = "Questão 1";
        conteudoMensagem = "Seja bem-vindo(a) aos testes da resolução dos desafios!";
        conteudoMensagem += "\nPara o primeiro desafio, você vai testar a construção da escada de asterísticos.";
        conteudoEntrada = "\nDigite o número de níveis que você quer que a escada tenha:";

        Main.chamarMensagem(conteudoMensagem,titulo);
        niveis = Main.chamarEntrada(conteudoEntrada,titulo);

        niveis = verificarNumero(niveis);
        criarEscada(Integer.parseInt(niveis));
    }

    public static void criarEscada(int niveis){

        final String espaco = " ";
        final String asteristico = "*";
        String escada = "";

        for (int i = 1; i <= niveis; i++) {

            int quantidadeEspaco = niveis - i;
            int quantidadeAsteristico = i;

            escada += espaco.repeat(quantidadeEspaco) + asteristico.repeat(quantidadeAsteristico) + "\n";
        }

        if (niveis == 1) {
            Main.chamarMensagem("\nEscada de " + niveis + " nível criada.\n" + escada,"Questão 1");
        } else {
            Main.chamarMensagem("\nEscada de " + niveis + " níveis criada.\n" + escada,"Questão 1");
        }
    }

    public static String verificarNumero(String niveis){


        while (!niveis.matches("[0-9]+")){
            niveis = Main.chamarEntrada("Digite apenas números.","Questão 1");
        }
        return niveis;
    }
}
