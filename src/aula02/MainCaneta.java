package aula02;

public class MainCaneta {


    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic");

        c1.setCor("Azul");
        c1.setCarga(4);
        c1.setPonta(0.5f);
        c1.setTampada(true);
        c1.rabiscar();
        c1.cargaCaneta();

        System.out.println("Cor: " + c1.getCor() + ", Modelo: " + c1.getModelo() + ", Ponta: " + c1.getPonta());
    }

}
