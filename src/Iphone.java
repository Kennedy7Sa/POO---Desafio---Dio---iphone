public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical tocador = new ReprodutorMusical();
        tocador.setSelecionaarMusica("Meu tributo");
        tocador.tocar();
        tocador.pausar();

    AparelhoTelefonico telefone = new AparelhoTelefonico();
    telefone.setNumeroTelefonico("4488-9988");
    telefone.ligar();
    telefone.desligar();
    telefone.atendeder();
    telefone.iniciarCorreioVoz();

    NavegadorInternet navegador = new NavegadorInternet();
    navegador.exibirPagina("www.linkedin.com.br");
    navegador.adcionarNovaAba();
    navegador.atualizarPagina();


    }
}
