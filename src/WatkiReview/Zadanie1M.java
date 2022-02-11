package WatkiReview;

public class Zadanie1M {
/*
Napisz metodę, która przyjmuje liczbę całkowitą. Wywołanie metody powinno uruchomić wątek 0., wewnątrz tego wątku powinien zostać uruchomiony wątek 1. Wątek 1.
 powinien uruchomić wątek 2. itd.
  do osiągnięcia zadanej liczby wątków. Każdy z wątków powinien wypisać na konsolę swoją domyślną nazwę.

Na przykład wywołanie metody:
 */


    public static void main(String[] args) throws InterruptedException {
      startNestedThreads(5);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
int ilosc=0;
int  counter =0;
        while (counter<ilosc){
            new Thread( () -> {
                System.out.println(Thread.currentThread().getName());
                //startNestedThreads(ilosc);
            }
            ).start();
         //   System.out.println(" licznik"+counter);
            counter++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



        class ReversedNestedThread extends Thread {
            private final int children;

            ReversedNestedThread(int children) {
                this.children = children;
            }

            @Override
            public void run() {
                if (children > 0) {
                    ReversedNestedThread childThread = new ReversedNestedThread(children - 1);
                    childThread.start();
                    try {
                        childThread.join();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(getName());
                }
            }}
startReversedThreads(10);
    }//psvm

    static void startReversedThreads(int howManyChildren) {
        new ReversedNestedThread(howManyChildren).start();
    }


    public static void startNestedThreads(int ilosc) throws InterruptedException {

   int  counter2 =0;
        while (counter2<=ilosc){
            new Thread( () -> {
                System.out.println(Thread.currentThread().getName());

            }
            ).start();
            try {
                Thread.currentThread().join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
         //   System.out.println(" licznik"+counter2);


            counter2++;

        }




    }



}//clasa

