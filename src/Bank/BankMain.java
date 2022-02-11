package Bank;

public class BankMain implements BankTransfer {

     public final int provison = 1;

    @Override
    public void transfer(BankAccount from, BankAccount to, int amount) throws IllegalAccessException {
        if(from.getSaldo() < amount + provison){
            throw new IllegalStateException("niewystarczajaca ilosc srodkow");
        }
        from.withdraw(amount+provison);
        to.deposit(amount);
    }



    public BankAccount openAccount() {
        return new BankAccount();
    }

    public static void main(String[] args) throws IllegalAccessException {

    int provison = 1;

    BankMain bank = new BankMain();
    BankAccount zleceniodawca = bank.openAccount();
    BankAccount odbiorca = bank.openAccount();


        zleceniodawca.deposit(100);
        odbiorca.deposit(100);

        bank.transfer(zleceniodawca,odbiorca,20);
        System.out.println(zleceniodawca.getSaldo());
        System.out.println(odbiorca.getSaldo());


    }




}
