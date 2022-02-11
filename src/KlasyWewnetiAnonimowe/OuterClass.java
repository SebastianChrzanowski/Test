package KlasyWewnetiAnonimowe;

public class OuterClass {
    int a = 6;

    public OuterClass(int a) {
        this.a = a;
    }
    public class InnerClass{
        OuterClass zewnetrzna = new OuterClass(4);
    }

    public static class KlasaStatycznaWewnetrzna{

    }

    public InnerClass instancja(){

        return new InnerClass();
    }

    public KlasaStatycznaWewnetrzna instancjaStatic(){
        return new KlasaStatycznaWewnetrzna();
    }


}
