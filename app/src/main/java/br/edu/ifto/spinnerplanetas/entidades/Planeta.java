package br.edu.ifto.spinnerplanetas.entidades;

public class Planeta {
    private final String nome;
    private final int imagem;
    private final int texto;

    public Planeta(String nome, int imagem, int texto) {
        this.nome = nome;
        this.imagem = imagem;
        this.texto = texto;
    }

    public String getNome() {
        return nome;
    }

    public int getImagem() {
        return imagem;
    }

    public int getTexto() {
        return texto;
    }
}
