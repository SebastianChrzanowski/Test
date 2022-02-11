package Bank;

public interface Account {
    void deposit(int amount) throws IllegalAccessException;
    void withdraw(int amount) throws IllegalAccessException;

}
