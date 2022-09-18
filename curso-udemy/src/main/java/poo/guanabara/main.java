package main.java.poo.guanabara;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        List<Livro> livros = new ArrayList<Livro>();

        pessoas.add(new Pessoa("Pedro", 22, "M"));
        pessoas.add(new Pessoa("Maria", 25, "F"));


        livros.add(new Livro("A volta dos que não foram", "Godoy", 5, 1, false, pessoas.get(0)));
        livros.add(new Livro("Tranças do rei careca", "Calvinho", 300, 150, true, pessoas.get(0)));
        livros.add(new Livro("Judô para idosos", "dona  ivate", 1928, 314, true, pessoas.get(1)));

        System.out.println(livros.get(0).detalhes());
        livros.get(0).folhear(2);
        System.out.println(livros.get(0).getPagAtual());
        livros.get(0).abrir();
        livros.get(0).avancarPag();
        System.out.println(livros.get(0).isAberto());
        System.out.println(livros.get(0).getPagAtual());

        pessoas.get(0).fazerAniver();
        System.out.println(pessoas.get(0).getIdade());

    }
}
