public class Program_1 {
    public static void main(String[] args) {

        class Foo {
            public int i = 3;
        }

        Object object = (Object) new Foo();
        Foo foo = (Foo) object;
        System.out.println("i = " + foo.i);

    }
}