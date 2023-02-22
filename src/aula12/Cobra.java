package aula12;

public class Cobra extends Reptil {

    @Override
    public void alimentar() {
        System.out.println("Comendo bichinhos pequenos...");
    }


    @Override
    public void emitirSom() {
        System.out.println("Cobra não emite som");
    }
}
