package KlasyWewnetiAnonimowe;

public class Main {


    private static Object OuterClass;

    public static void main(String[] args) {

        OuterClass instacjaOuer =new OuterClass(2);
        OuterClass.InnerClass wewnetrznyObiekt= instacjaOuer.new InnerClass();
      //  OuterClass.InnerClass wewnetrznyObiekt2 =  this.new KlasyWewnetiAnonimowe.OuterClass.InnerClass()
        instacjaOuer.instancja();

        OuterClass instacjaOuer2 =new OuterClass(2);

        OuterClass.KlasaStatycznaWewnetrzna statycznaWewnetrzna = new OuterClass.KlasaStatycznaWewnetrzna();

        AnonimowyTestowyInterfacee button1 = new AnonimowyTestowyInterfacee() {
            @Override
            public void metodaAnonimowa() {
                System.out.println("Wywoalenie metody z interface");
            }
        };

        button1.metodaAnonimowa();

        Robot Sebastian = new Robot(new GreetingModule() {
            @Override
            public void SaidHello() {
                System.out.println("witaj po polski");
            }
        });

        Robot Hans = new Robot(new GreetingModule() {
            @Override
            public void SaidHello() {
                System.out.println("Hi Hitla!!");
            }
        });


        Robot Jonh = new Robot(new GreetingModule() {
            @Override
            public void SaidHello() {
                System.out.println("hi gays");
            }
        });


        Sebastian.saySomething();
        Hans.saySomething();
        Jonh.saySomething();


    }
}
