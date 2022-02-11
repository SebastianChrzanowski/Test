package TryWithResources;

public class MyContextManager implements AutoCloseable{
    MyContextManager(){
        System.out.println("tworzenie obiektu z konsturktora");
    }

    public void run(){
        System.out.println("dzialanie programu");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Zamykanie z void close");
    }
}
