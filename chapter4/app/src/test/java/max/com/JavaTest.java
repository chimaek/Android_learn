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
}
