//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        // ou ContaCorrente cc = new ContaCorrente();
        cc.depositar(100);


        ContaPoupanca cp = new ContaPoupanca();
        // ou Conta cp = new ContaPoupanca();
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        }
    }
