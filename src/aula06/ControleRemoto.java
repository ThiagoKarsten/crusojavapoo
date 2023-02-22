package aula06;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligando;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 20;
        this.ligando = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigando() {
        return ligando;
    }

    public void setLigando(boolean ligando) {
        this.ligando = ligando;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        setLigando(true);
    }

    @Override
    public void desligar() {
        setLigando(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-----MENU----");
        System.out.println("Esta ligado? " + this.getLigando());
        System.out.println("Esta tocando ? " + this.getTocando());
        System.out.print("Volume: ");
        for (int i = 1; i <= this.getVolume(); i += 10) {
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigando()) {
            this.setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigando()) {
            this.setVolume(this.getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigando() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigando() && this.getVolume() == 0){
            this.setVolume(20);
        }
    }

    @Override
    public void play() {
if(this.getLigando() && !(this.getTocando())){
     this.setTocando(true);
        }
    }

    @Override
    public void pause() {
if(this.getLigando() && this.getTocando()){
    this.setTocando(false);
}
    }
}
