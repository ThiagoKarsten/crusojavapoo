package aula12;

public class Canguru extends Mamifero{
    public void usarBolas(){
        System.out.println("Usando a bolsa");
    }
    @Override
    public void locomover(){
        System.out.println("Canguru esta saltando");
    }
}
