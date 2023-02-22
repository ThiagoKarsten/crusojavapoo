package aula10;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public Funcionario(int idade, String nome, String sexo, String setor, boolean trabalhando) {
        super(idade, nome, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho() {

    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String funcionario () {
        return "-------------Funcionario------------" +
                " Setor='" + setor + '\'' +
                " Trabalhando=" + trabalhando +
                " Nome = " + this.getNome() + "\n" +
                " Idade = " + this.getIdade() + "\n" +
                " Sexo = " + this.getSexo() + "\n" +
                "--------------------------------------";

    }
}
