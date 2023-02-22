package aula07;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public void apresentar() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("E agora com vocês o lutador " + this.getNome() + " diretamente da "
                + this.getNacionalidade() + " com " + this.getIdade() + " anos e " + this.getAltura() +
                " de altura " + " com o peso de " + this.getPeso() + ", atualmente ele acumula " +
                this.getVitorias() + " vitorias, " + this.getDerrotas() + " derrotas e " + this.getEmpates() + " empates!!!");

    }

    public void status() {
        System.out.println("---------------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("é um peso: " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
        System.out.println();
    }

    public void ganharLuta() {

        this.vitorias = this.getVitorias() + 1;
    }

    public void perderLuta() {
        this.derrotas = this.getDerrotas() + 1;
    }

    public void empatarLuta() {

        this.empates = this.getEmpates() + 1;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }


    public String getNacionalidade() {

        return nacionalidade;
    }

    public void setNacionalidade(String na) {

        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int id) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Invalido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Medio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }

    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vit) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = empates;
    }
}
