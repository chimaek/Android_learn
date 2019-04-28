package max.com;

public class SinglePattonJava {

    //싱글톤 패턴은 생성자를 private를 감춘다
    private SinglePattonJava() {
    }

    private static SinglePattonJava instance = new SinglePattonJava();

    public static SinglePattonJava getInstance() {
        return instance;
    }

    public void log(String text) {
        System.out.println(text);
    }
}
