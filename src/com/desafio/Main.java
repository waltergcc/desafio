package com.desafio;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Escada.questao1();
        Login.questao2();
        Anagrama.questao3();
        chamarMensagem("Tester,\nMuito obrigado por testar meu código!","Desafio Capgemini");

    }

    public static void chamarMensagem(String mensagem, String titulo){
        JOptionPane.showMessageDialog(null,mensagem,titulo,1);
    }

    public static String chamarEntrada(String mensagem, String titulo){
        return JOptionPane.showInputDialog(null,mensagem,titulo,1);
    }
}