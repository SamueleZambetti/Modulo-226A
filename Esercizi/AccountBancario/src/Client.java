/**
 * Rappresenta un cliente che possiede un account bancario.
 */
public class Client {
    private String name;
    private Account account;

    public Client(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    /**
     * Aggiunge fondi al conto del cliente.
     *
     * @param amount Importo da depositare.
     */
    public void addFunds(double amount) {
        account.deposit(amount);
    }

    /**
     * Preleva fondi dal conto del cliente.
     *
     * @param amount Importo da prelevare.
     */
    public void withdrawFunds(double amount) {
        account.withdraw(amount);
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }
}
