package aula12;

public class Ave extends Animal {
    private String corPena;

    public void fazerNinho() {
        System.out.println("A ave esta fazendo um ninho");
    }

    public void locomover() {
        System.out.println("Ave esta voando");
    }

    public void alimentar() {
        System.out.println("A ave esta comendo sementes");
    }

    public void emitirSom() {
        System.out.println("A ave esta cantando");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
