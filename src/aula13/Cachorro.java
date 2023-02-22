package aula13;

public class Cachorro extends Lobo {
    @Override
    public void emitirSom() {
        System.out.println("Au!Au!Au!");
    }

    public void reagir(String frase) {
        if (frase == "toma comida" || frase == "Ola") {
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("Abanar rabo");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(boolean dono) {
        if (dono == true) {
            System.out.println("Abanar rabo e pular de alegria");
        } else {
            System.out.println("Rosnar e latir");
        }
    }

    public void reagir(int idade, float peso) {
        if (idade < 5 || peso < 10) {
            System.out.println("Abanar rabo");
        } else if (idade > 5 || peso > 10) {
            System.out.println("Latir e rosnar");

        }
    }
}
