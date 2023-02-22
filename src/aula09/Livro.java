package aula09;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;


    public Livro(String titulo, String autor, int totPaginas, int paginaAtual, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.paginaAtual = paginaAtual;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String detalhes() {
        return "---------- Livro---------\n" +
                "Titulo = " + titulo + "\n" +
                ", Autor = " + autor + "\n" +
                ", TotPaginas = " + totPaginas + "\n"+
                ", PaginaAtual = " + paginaAtual + "\n"+
                ", Aberto = " + aberto + "\n"+
                ", Leitor = " + leitor.getNome() + "\n"+
                ", Idade = " + leitor.getIdade() + "\n"+
                ", Sexo = " + leitor.getSexo() + "\n" +
        "----------------------------------------------------";

    }

    @Override
    public void abrir() {
        this.aberto = true;
    }


    @Override
    public void fechar() {
        if (aberto = false) {
            System.out.println("Seu livro ja esta fechado!!");
            this.aberto = false;
        } else if (aberto) {
            System.out.println("Seu livro esta sendo fechado...");
            this.aberto = false;
        }
    }

    @Override
    public void folhear() {
        if (aberto && this.paginaAtual < this.totPaginas) {
            System.out.println("livro esta sendo foleado...");
            this.setPaginaAtual(this.getPaginaAtual() + 3);
        } else if (aberto = false) {
            System.out.println("Seu livro esta fechado e não pode ser foleado");
            this.setPaginaAtual(0);
        }

    }

    @Override
    public void avancarPag() {
        if (aberto && this.paginaAtual < this.totPaginas) {
            System.out.println("Avançando pagina...");
            this.setPaginaAtual(this.getPaginaAtual() + 1);
        } else if (aberto = false) {
            System.out.println("Seu livro esta fechado...");
        }
    }

    @Override
    public void voltarPag() {
        if (aberto) {
            System.out.println("Voltando pagina...");
            this.setPaginaAtual(this.getPaginaAtual() - 1);
        } else if (aberto = false) {
            System.out.println("Seu livro esta fechado...");
        }
    }

    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

}
