package br.com.spotify.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " e considerado um sucesso absoluto! ");
        }else {
            System.out.println(audio.getTitulo() + " Tambem e um dos que todo mundo esta curtindo ");
        }
    }
}
