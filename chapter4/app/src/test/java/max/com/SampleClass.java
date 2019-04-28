package max.com;

public class SampleClass {
    int outFiled = 0;

    class InnerClass {
        int myFiled = outFiled;
    }

    public static class NestedClass {

    }
}
