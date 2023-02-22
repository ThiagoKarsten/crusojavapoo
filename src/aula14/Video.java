package aula14;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private float views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    @Override
    public void play() {
        if (this.reproduzindo == false) {
            this.reproduzindo = true;
            this.views = views +1;
        } else if (this.reproduzindo) {
            this.reproduzindo = true;
        }
    }

    @Override
    public void pause() {
        if (this.reproduzindo) {
            this.reproduzindo = false;
        } else if (this.reproduzindo == false) {
            this.reproduzindo = false;
        }
    }

    @Override
    public void like() {
        this.curtidas = this.curtidas + 1;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int)((this.avaliacao + avaliacao) / this.views);

        this.avaliacao = nova;
    }

    public float getViews() {
        return views;
    }

    public void setViews(float views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video" +"\n"+
                "Titulo: " + titulo + "\n" +
                "Avaliacao: " + avaliacao +"\n"+
                "Views: " + views +"\n"+
                "Curtidas: " + curtidas +"\n"+
                "Reproduzindo: " + reproduzindo + "\n"+
                "++++++++++++++++++++++++++++++++++";
    }
}
