public class AparelhoTelefonico {
    String numeroTelefonico;

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }
    public void ligar(){
        System.out.println(String.format("Ligando para o numero %s",numeroTelefonico));
        System.out.println("chamando");
    }

    public void desligar(){
        System.out.println("Finalizando chamada");
    }

    public void atendeder(){
        System.out.println("atendendo chamada ");
    }
    public void iniciarCorreioVoz(){
        System.out.println(String.format("Iniciando correio de voz para o numero %s",numeroTelefonico));
    }

}
