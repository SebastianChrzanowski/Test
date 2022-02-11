package WatkiReview;

public class MainWatki {


    public static void main(String[] args) throws InterruptedException {


        class Counter {
            private int value;

            public void increment() {
                synchronized (this){
                value += 1;}
            }

            /*
             public synchronized void increment() {

                value += 1;
            }
             */

            public int getValue() {
                return value;
            }
        }


        Counter c = new Counter();
        Runnable r = () -> {
            for (int i = 0; i < 100_000; i++) {
                c.increment();
            }
        //    System.out.println(c.getValue());
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(c.getValue());


        System.out.println("MT start");
        Thread thread = new Thread(() -> {
            System.out.println("T0 start");
            for (int i = 0; i < 5; i++) {
                System.out.println("T0 " + i);
            }
            System.out.println("T0 stop");
        });
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("MT " + i);
        }
        System.out.println("MT stop");

        Watek watek = new Watek();
 //       watek.start();



        Thread nowyWatek = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread nowyWatekLambda = new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                System.out.println("Lambda");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        );

   //     nowyWatek.start();
   //     nowyWatekLambda.start();

    }//psvm !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

} // Main Watki $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

class Watek extends Thread {
    public void run() {
        System.out.println("lalla RUN");
        for (int i = 0; i < 30; i++) {
            System.out.println("lalla");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class Counter {
    private int value;

    public void increment() {
        value += 1;
    }

    public int getValue() {
        return value;
    }
}

