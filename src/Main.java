public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Halef");

        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente1);

        cc.depositar(500);
        cc.transferir(cp,100);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
