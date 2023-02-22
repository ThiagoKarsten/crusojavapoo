package aula11;

public class Aula11Main {
    public static void main(String[] args) {
        Bolsista b1 = new Bolsista();
        b1.setNome("Junior");
        b1.setIdade(18);
        b1.setMatricula(1515);
        b1.pagarMensalidade();
        b1.setSexo("Masculino");

        Aluno a1 = new Aluno();
        a1.setNome("Alex");
        a1.setIdade(19);
        a1.setMatricula(1415);
        a1.pagarMensalidade();
        a1.setSexo("Masculino");

        Tecnico t1 = new Tecnico();
        t1.setNome("Thiago");
        t1.setMatricula(15748);
        t1.setIdade(22);
        t1.setCurso("Mecatronica");
        t1.setSexo("Masculino");
        t1.praticar();
        System.out.println(t1);


    }
}
