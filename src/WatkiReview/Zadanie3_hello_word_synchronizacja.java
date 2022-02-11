package WatkiReview;

public class Zadanie3_hello_word_synchronizacja {
    public static void main(String[] args) throws InterruptedException {


        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 4; i++) {
                System.out.print("Hello ");

            }
        });
        t1.start();


        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 4; i++) {
                System.out.print("world");
            }
        });
        t2.start();


        Thread t3 = new Thread(() -> {
            for(int i = 0; i < 4; i++) {
                System.out.println("!");
            }
        });
        t3.start();



    }


}
