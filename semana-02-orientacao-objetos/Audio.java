package br.com.spotify.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalDeRepro;
    private int totalDeCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeRepro() {
        return totalDeRepro;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir(){
        this.totalDeCurtidas++;
    }

    public void reproduzir(){
        this.totalDeRepro++;
    }
}
