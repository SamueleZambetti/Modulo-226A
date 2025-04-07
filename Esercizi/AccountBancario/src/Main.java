public class Main {
    public static void main(String[] args) {
        Account account = new Account("123456789", 3.5);
        Client client = new Client("Gabriel Gonçalves", account);

        System.out.println("Cliente: " + client.getName());
        System.out.println("Numero di conto: " + client.getAccount().getAccountNumber());
        System.out.println("Saldo iniziale: " + client.getAccount().getBalance());

        client.addFunds(4.5); //Da Nicolas per il pranzo
        client.withdrawFunds(3.0);

        System.out.println("Saldo finale: " + client.getAccount().getBalance());
    }
}