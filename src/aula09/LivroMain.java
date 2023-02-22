package aula09;

public class LivroMain {
    public static void main(String[] args) {
        Pessoa [] p =  new Pessoa[2];
        Livro [] l = new Livro[3];

        p[0] = new Pessoa("Jose", 25, "Masculino");
        p[1] = new Pessoa("Isadora", 30, "Feminino");

        l[0] = new Livro("Lei da Atração", "Jusep", 300, 299, p[1]);
        l[0].abrir();
        l[0].avancarPag();

        System.out.println(l[0].detalhes());

    }
}
