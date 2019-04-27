package max.com;

public final class Sword implements  ISword{
    String name;

    public Sword(String name) {
        this.name = name;
    }

    public void equip() {
        System.out.println(name + "이 장착되었습니다.");
    }

}
