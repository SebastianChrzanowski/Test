package Bank;
// deposit - depozyt
// withdraw - zabierac
// Zrobic konstukor z saldem
// zakaz robienie operacji ponizej zera throw new illegalA...
public class BankAccount implements Account{

    private int saldo;

    BankAccount(){
       this(0);
    }

    BankAccount(int saldo){
        this.saldo=saldo;
    }


    @Override
    public void deposit(int amount) throws IllegalAccessException {
            if (amount <=0){
                throw new IllegalAccessException("Nie zero");
            }
            saldo += amount;
    }

    @Override
    public void withdraw(int amount) throws IllegalAccessException {
        if (amount <=0){
            throw new IllegalAccessException("Nie zero");
        }
        saldo -= amount;
    }

    public int getSaldo() {
        return saldo;
    }
}
