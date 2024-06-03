public class ReprodutorMusical {
   String selecionaarMusica;

    public String getSelecionaarMusica() {
        return selecionaarMusica;
    }

    public void setSelecionaarMusica(String selecionaarMusica) {
        this.selecionaarMusica = selecionaarMusica;
    }

    public void tocar(){
        System.out.println(String.format("Tocando: %s",selecionaarMusica));
    }
    public void pausar(){
        System.out.println(String.format("Musica %s pausada",selecionaarMusica));
    }
}
