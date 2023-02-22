package aula14;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 Poo");
        v[1] = new Video("Carro top");


        //-------------------------------------------------------------//
        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("Thiago", 18, "Masculino", "thiago_karsten");



        Visualizacao vis [] = new Visualizacao[3];
        vis[0] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar(10);
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[0]);
        vis[1].avaliar(35.0f);
        System.out.println(vis[1].toString());




    }


}
