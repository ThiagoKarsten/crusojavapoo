package aula02;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    public Caneta(String modelo) {
        this.modelo = modelo;
    }

    public void rabiscar() {
        if (tampada) {
            System.out.println("Caneta esta tampada, não será possivel escrever");
        } else {
            System.out.println("Caneta destampada, rabsicando");
        }
    }

    public void cargaCaneta(){
       if(carga <= 4){
           System.out.println("Sua Caneta está com pouca carga");
       }

        }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
}
