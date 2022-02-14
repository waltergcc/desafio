package com.desafio;

public class Login {

    public static void questao2() {

        String titulo;
        String conteudoMensagem;
        String conteudoEntrada;
        String senha;

        titulo = "Questão 2";
        conteudoMensagem = "\nPara testar esse desafio você deverá criar uma senha forte.";
        conteudoMensagem += "\nA senha precisa ter no mínimo 6 carecteres, e deve conter pelo menos";
        conteudoMensagem += "\n1 número, 1 letra maíscula, 1 letra minúscula e 1 caracter especial.\n";
        Main.chamarMensagem(conteudoMensagem,titulo);

        conteudoEntrada = "Digite a senha:";
        senha = Main.chamarEntrada(conteudoEntrada,titulo);
        verificarSenha(senha);
    }

    public static void verificarSenha(String senha){

        final String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])(?=\\S+$).{6,}";

        while (!senha.matches(pattern)){

            int comprimentoSenha = senha.length();
            String conteudoEntrada = "";

            if (comprimentoSenha < 6) {
                int diferencaCaracteres = 6 - comprimentoSenha;
                conteudoEntrada = "Sua senha precisa de no minímo mais " + diferencaCaracteres + " caracter(es)\n";
            }

            conteudoEntrada += "A senha ainda não é forte o suficiente.\nDigite novamente:";
            senha = Main.chamarEntrada(conteudoEntrada,"Questão 2");

        }

        Main.chamarMensagem("Sua senha é forte! Você está pronto para a próxima resolução.","Questão 2");
    }
}
