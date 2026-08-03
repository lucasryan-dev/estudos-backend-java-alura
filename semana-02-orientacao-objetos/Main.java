package br.com.spotify.minhasmusicas.principal;

import br.com.spotify.minhasmusicas.modelos.MinhasPreferidas;
import br.com.spotify.minhasmusicas.modelos.MostrarDescricao;
import br.com.spotify.minhasmusicas.modelos.Musicas;
import br.com.spotify.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musicas musicas = new Musicas();
        musicas.setTitulo("Beatriz");
        musicas.setArtista("2zDiniz");
        musicas.setGenero("Hip Hop");

        Musicas musicas1 = new Musicas();
        musicas1.setTitulo("Tempo Perdido");
        musicas1.setArtista("MC Hariel");
        musicas1.setGenero("Funk");

        for (int i = 0; i < 1000 ; i++) {
            musicas.reproduzir();
        }

        for (int i = 0; i < 50 ; i++) {
            musicas.curtir();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("PodPah");
        podcast.setHost("Igao e Mitico");
        podcast.setDescricao("Podpah é um podcast brasileiro apresentado por Igor Cavalari (Igão) e Thiago Marques (Mítico), formado em 2020. É o maior podcast do Brasil, com quase 10 milhões de inscritos no YouTube.");

        for (int i = 0; i < 5000; i++) {
            podcast.reproduzir();
        }

        for (int i = 0; i < 1000 ; i++) {
            podcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musicas);
        preferidas.inclui(podcast);
        preferidas.inclui(musicas1);

        MostrarDescricao desc = new MostrarDescricao();
        desc.mostrar(podcast);
    }
}
