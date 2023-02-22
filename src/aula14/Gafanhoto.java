package aula14;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssitido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssitido = 0;
    }

    public void viuMaisUm(){
        this.totAssitido = this.totAssitido + 1;
        this.setExperiencia(this.getExperiencia() + 1);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssitido() {
        return totAssitido;
    }

    public void setTotAssitido(int totAssitido) {
        this.totAssitido = totAssitido;
    }

    @Override
    public String toString() {
        return "Gafanhoto" +"\n"+
                "Login: " + login + "\n" +
                "TotAssitido: " + totAssitido +"\n"+
                "Nome: " + nome + "\n" +
                "Idade: " + idade +"\n"+
                "Sexo: " + sexo + "\n" +
                "Experiencia: " + experiencia +"\n"+
                "++++++++++++++++++++++++++++++++++";

    }
}
