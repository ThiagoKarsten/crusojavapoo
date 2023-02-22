package aula10;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public Aluno(int idade, String nome, String sexo, int matricula, String curso) {
        super(idade, nome, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    public void cancelarMatricula() {
    if(matricula > 0 ){
        System.out.printf("Matricula cancelada!!");
        matricula = 0;
    }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String aluno() {
        return "-------------Aluno----------" + "\n" +
                " Matricula = " + matricula + "\n" +
                " Curso = " + curso + "\n" +
                " Nome = " + this.getNome() + "\n" +
                " Idade = " + this.getIdade() + "\n" +
                " Sexo = " + this.getSexo() + "\n" +
                "-----------------------------------";
    }
}
