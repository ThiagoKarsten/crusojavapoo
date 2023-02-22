package aula07;

public class LutadorMain {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Prety boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil" , 29, 1.68f , 100.8f, 14, 2 , 3);
        l[2] = new Lutador("Jose", "Africa", 35, 1.80f, 80.5f, 20,5,4);
        l[3] = new Lutador("Anderson", "Estados Unidos", 40, 1.90f, 110.0f, 5, 10, 6);
        l[4] = new Lutador("Thiago", "Polonia", 30, 1.78f, 75.0f, 20,8,10);
Luta UFC =  new Luta();
UFC.marcarluta(l[1], l[1]);
UFC.lutar();


    }
}
