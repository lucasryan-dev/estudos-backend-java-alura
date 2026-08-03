package br.com.spotify.minhasmusicas.modelos;

public class Podcast extends Audio {
    private String titulo;
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeCurtidas() > 500){
            return 10;
        }else {
            return 8;
        }
    }


}
