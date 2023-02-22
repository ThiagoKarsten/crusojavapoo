package aula10;

public class PessoaMain {
    public static void main(String[] args) {
        Aluno p1 = new Aluno(18, "Jose", "Masculino", 2, "Sistemas da Informação");
        Professor p2 = new Professor(52, "Aldo", "Masculino", "Computação",5200 );
        p2.receberAumento(500f);

        System.out.println(p2.professor());
        System.out.println(p1.aluno());
    }
}
