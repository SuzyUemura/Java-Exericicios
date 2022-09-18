package main.java.poo;

public class JogadorTeste {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("João", "Atacante", "09/09/1990");
        jogador.imprimirDadosJogador();
        jogador.imprimirIdadeJogador(2000);
        jogador.imprimirQuantoTempoFaltaAposentadoria(2000, "ATACANTE");
        jogador.imprimirQuantoTempoFaltaAposentadoria(2000, "MEIO-CAMPO");
        jogador.imprimirQuantoTempoFaltaAposentadoria(2000, "DEFESA");
    }
}
