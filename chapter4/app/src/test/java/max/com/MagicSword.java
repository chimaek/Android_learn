package max.com;

public class MagicSword implements ISword {
    ISword iSword;

    public MagicSword(ISword iSword) {
        this.iSword = iSword;
    }

    @Override
    public void equip() {
        playMusic();

        iSword.equip();
    }

    public void playMusic() {
        System.out.println("짜잔");
    }

}
