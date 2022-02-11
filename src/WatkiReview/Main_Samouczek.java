package WatkiReview;

public class Main_Samouczek {

    public static void main(String[] args) {
        watekStart(5);
    }//psvm

    public static void watekStart(int ileRazy){
        new TreadSeby(ileRazy).start();
    }


}//klasa


class TreadSeby extends Thread{
    int ilosc;

    public TreadSeby(int ilosc) {
        this.ilosc = ilosc;

        }

    @Override
    public void run() {
        if (ilosc>0) {
            TreadSeby dzieckoWatek = new TreadSeby(ilosc -1);
            dzieckoWatek.start();
//            System.out.println(dzieckoWatek.getName());
            try {
                dzieckoWatek.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(dzieckoWatek.getName());
        }
    }
    }
