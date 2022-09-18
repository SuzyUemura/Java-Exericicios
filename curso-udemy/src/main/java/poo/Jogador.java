package main.java.poo;

import java.util.Date;
import java.util.Locale;

public class Jogador {
    private String nome;
    private String posição;
    private String dataNascimento;

    public Jogador(String nome, String posição, String dataNascimento) {
        this.nome = nome;
        this.posição = posição;
        this.dataNascimento = dataNascimento;
    }

    public void imprimirDadosJogador() {
        System.out.println("Nome: " + getNome() + "\n"
                        + "Posição: " + getPosição() + "\n"
                        + "Data de Nascimento: " + getDataNascimento());
    }

    public void imprimirIdadeJogador(int anoNascimento) {
        int idade = 2022 - anoNascimento;
        System.out.println("Idade: " + idade);
    }

    public void imprimirQuantoTempoFaltaAposentadoria(int anoNascimento, String posicao) {
        int idade = 2022 - anoNascimento;
        switch (posicao.toLowerCase()) {
            case "defesa":
                System.out.println("Falta: " + (40 - idade) + " anos");
                break;
            case "meio-campo":
                System.out.println("Falta: " + (38 - idade) + " anos");
                break;
            case "atacante":
                System.out.println("Falta: " + (35 - idade) + " anos");
                break;
            default:
                System.out.println("Não foi possivel identificar sua posição");
        }

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosição() {
        return posição;
    }

    public void setPosição(String posição) {
        this.posição = posição;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
