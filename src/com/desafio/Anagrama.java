package com.desafio;

import java.util.Arrays;
import java.util.HashMap;

public class Anagrama {

    public static void questao3(){

        String titulo;
        String conteudoMensagem;
        String conteudoEntrada;
        String palavra;

        titulo = "Questão 3";
        conteudoMensagem = "\nPara testar esse desafio você digitará uma palavra";
        conteudoMensagem += "\ne o algoritmo informará quantos pares de anagrama ela tem.\n";
        Main.chamarMensagem(conteudoMensagem,titulo);

        conteudoEntrada = "Digite sua palavra para a verificação.";
        palavra = Main.chamarEntrada(conteudoEntrada,titulo);

        conteudoMensagem = "Quantidade de anagramas em sua palavra: ";
        Main.chamarMensagem(conteudoMensagem + contarAnagramas(palavra),titulo);
    }

   public static int contarAnagramas(String palavra){

        HashMap<String, Integer> dicionario = new HashMap<>();

        for(int i = 0; i < palavra.length(); i++){

            for(int j = i; j < palavra.length(); j++){

                char[] letrasSeparadas = palavra.substring(i, j+1).toCharArray();
                Arrays.sort(letrasSeparadas);
                String letrasReagrupadas = new String(letrasSeparadas);

                if (dicionario.containsKey(letrasReagrupadas)){
                    dicionario.put(letrasReagrupadas, dicionario.get(letrasReagrupadas)+1);
                }else{
                    dicionario.put(letrasReagrupadas, 1);
                }
            }
        }

        int quantidadeAnagramas = 0;

        for(String key: dicionario.keySet()){

            int combinacoes = dicionario.get(key);
            quantidadeAnagramas += (combinacoes * (combinacoes-1))/2;
        }

        return quantidadeAnagramas;
    }
}

