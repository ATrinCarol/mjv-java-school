// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ContaCorrente primeiraConta = new ContaCorrente(1,5000.0);
        System.out.println("O valor do seu saldo é ".concat(primeiraConta.consultarSaldo().toString()));
        System.out.println("Após o saque o seu saldo ficou em ".concat(primeiraConta.sacar(250.0).toString()));
        System.out.println("O número da conta é ".concat(primeiraConta.getNumero().toString()));

        primeiraConta.cancelar();

        Cliente cliente1 = new Cliente("Carol", "Rua Tal", "4512515-5");






    }
}