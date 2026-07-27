package br.com.spotify.minhasmusicas.modelos;

public class Musicas extends Audio {
    private String album;
    private String genero;
    private String artista;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeRepro() > 800){
            return 10;
        }else {
            return 7;
        }
    }
}
