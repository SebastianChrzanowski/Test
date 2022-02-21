package Lambda;

public interface HumaFaktoryWithObject<Integer, String, Human> {
    Human stworzInstancje(int age, String name, Human human);
}
