package aula12;

public class Cachorro extends Mamifero{
    private boolean cavando;
    public void enterrarOsso(){
        if(cavando){
            System.out.println("O cachorro esta enterrando o osso");
        }else if (cavando == false){
            System.out.println("Não é possivel enterrar o osso pois o cachorro não esta cavando");
        }

    }
    public void abanarRabo(){
        System.out.println("O cachorro esta abanando o rabo");
    }

    public boolean getCavando() {
        return cavando;
    }

    public void setCavando(boolean cavando) {
        this.cavando = cavando;
    }
}
