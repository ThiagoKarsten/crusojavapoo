package aula10;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public Professor(int idade, String nome, String sexo, String especialidade, float salario) {
        super(idade, nome, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAumento(float au) {
        this.salario += au;

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSlario() {
        return salario;
    }

    public void setSlario(float slario) {
        this.salario = slario;
    }

    public String professor() {
        return "----------------Professor-------------------" + "\n"+
                " Especialidade = " + especialidade + "\n" +
                " Salario = " + salario + "\n" +
                " Nome = " + this.getNome() + "\n" +
                " Idade = " + this.getIdade() + "\n" +
                " Sexo = " + this.getSexo() + "\n" +
                "------------------------------";
    }
}
