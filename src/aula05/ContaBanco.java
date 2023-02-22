package aula05;

public class ContaBanco {
    private int numConta;
    public String tipoConta;
    public String dono;
    private float saldo = 0;
    public boolean status;

    public void status() {
        System.out.println("Numero da conta: " + getNumConta() + "\n Nome: " + getDono() + "\n Saldo: " + getSaldo() + "\n Tipo da Conta: "
                + getTipoConta() + "\n Status: " + status);
    }

    public void abrirConta() {
        if (tipoConta == "CC") {
            saldo = saldo + 50;
            status = true;
            System.out.println("Parabéns você abriu sua conta corrente e possui um saldo de: " + getSaldo());
        } else if (tipoConta == "CP") {
            saldo = saldo + 150;
            status = true;
            System.out.println("Parabéns você abriu sua conta poupança e seu saldo é de: " + getSaldo());
        }
    }

    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Você ainda tem " + getSaldo() + " reais na sua conta, saque todo esse dinheiro para podermos fechar sua conta");

        } else if (saldo == 0) {
            System.out.println("Parabens, sua conta foi fechada com sucesso !!!");
            status = false;
        }
    }

    public void depositar(float v) {
        if (status == true) {
            saldo = saldo + v;
            System.out.println("Seu dinheiro foi depositado com sucesso!!" + " Saldo apos o deposito: " + getSaldo());
        } else if (status == false) {
            System.out.println("Você nao possui uma conta para depositar dinheiro");
        }
    }

    public void sacar(float t) {
        if (status == true && saldo == saldo) {
            saldo = saldo - t;
            System.out.println("Seu dinheiro foi sacado com sucesso!!. Seu saldo apos o saque: " + getSaldo());
        } else if (status == false) {
            System.out.println("Você nao possui uma conta para sacar dinheiro");
        }
    }

    public void pagarMensalidade() {
        if (tipoConta == "CC") {
            saldo = saldo - 12;
        } else if (tipoConta == "CP") {
            saldo = saldo - 20;
        }
    }

    public int getNumConta() {

        return numConta;
    }

    public void setNumConta(int numConta) {

        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
