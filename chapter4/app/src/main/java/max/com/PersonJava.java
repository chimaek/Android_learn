package max.com;

public class PersonJava {
    private int age;
    private final String name;
    private String nickname;

    //get set이 모두있는경우 변수들을 프로퍼티라하고 없으면 필드라고한다.
    public PersonJava(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname.toLowerCase();
    }

    public String getNickname() {
        return nickname;
    }
}
