package TryWithResources;

public class Main {


    public static void main(String[] args) throws Exception {

        try(MyContextManager test = new MyContextManager()){
            test.run();
        }
        try(HtmlTag cos = new HtmlTag()){
            cos.body("lalalalala");
        }

    }
}
