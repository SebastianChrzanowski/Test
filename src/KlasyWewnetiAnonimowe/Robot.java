package KlasyWewnetiAnonimowe;

public class Robot {

    public GreetingModule greetingModule;

    public Robot(GreetingModule greetingModule) {
        this.greetingModule = greetingModule;
    }
    public void saySomething(){
greetingModule.SaidHello();
    }
}
