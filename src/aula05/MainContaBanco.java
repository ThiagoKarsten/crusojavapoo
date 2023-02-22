package aula05;

public class MainContaBanco {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();

        c1.setDono("Thiago Karsten");
        c1.setNumConta(124578963);
        c1.setTipoConta("CC");
        c1.abrirConta();
        c1.depositar(300);
        c1.sacar(100);
        c1.sacar(250);
        c1.fecharConta();



        c1.status();

    }
}
