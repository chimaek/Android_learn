package max.com;

import org.junit.Assert;
import org.junit.Test;

public class JavaTest {
    @Test
    public void test1() {
        Assert.assertEquals(4, 2 + 2);
    }

    @Test
    public void testGetterSetter() {
        PersonJava personJava = new PersonJava("MAX");
        personJava.setAge(20);

        Assert.assertEquals(20, personJava.getAge());
        Assert.assertEquals("MAX", personJava.getName());

        Person person = new Person("get");
        person.setAge(20);

        Assert.assertEquals(20, person.getAge());
        Assert.assertEquals("get", person.getName());
    }

    @Test
    public void testNickname() {
        PersonJava personJava = new PersonJava("MAX");
        personJava.setNickname("APPLE");
        Assert.assertEquals("apple", personJava.getNickname());

        Person person = new Person("join");
        person.setNickname("JOIN");
        Assert.assertEquals("join", person.getNickname());
    }

    @Test
    public void testMove(){
        MoveObject moveObject = new MoveObject();

        int acc = Calculator.calACC(moveObject,3);
        Assert.assertEquals(1,moveObject.getSpeed());

        MoveObject cantmove = new CantMove();

        acc =Calculator.calACC(cantmove,3);

        Assert.assertEquals(1,cantmove.getSpeed());
    }
}
