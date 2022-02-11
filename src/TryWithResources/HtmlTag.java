package TryWithResources;
/*
Zaimplementuj klasę HtmlTag, która będzie menadżerem kontekstu. W konstruktorze powinna przyjmować nazwę znacznika np. em. Klasa powinna mieć metodę body, która przyjmie parametr typu String i wypisze go na konsoli. Uruchamiając kod
 */
public class HtmlTag implements AutoCloseable{
    String textBody = "text metody";

    public HtmlTag() {
        System.out.println("<h1>");
        System.out.println("<h2>");
    }

    public void body(String textBody){
        System.out.println(textBody);
    }

    @Override
    public void close() throws Exception {
        System.out.println("</em>");
        System.out.println("</h1");


    }
}
