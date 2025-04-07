/**
 * Rappresenta un conto bancario con saldo e numero di conto.
 */
public class Account {
    private double balance;
    private String accountNumber;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Deposita una somma nel conto bancario.
     *
     * @param amount Importo da depositare (deve essere positivo).
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Depositato: " + amount + " Nuovo saldo: " + balance);
        } else {
            System.out.println("L'importo deve essere positivo");
        }
    }

    /**
     * Preleva una somma dal conto bancario se il saldo è sufficiente.
     *
     * @param amount Importo da prelevare (deve essere positivo e non superare il saldo disponibile).
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Prelevato: " + amount + " Nuovo saldo: " + balance);
        } else {
            System.out.println("Fondi insufficienti");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
