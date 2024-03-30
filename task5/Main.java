package task5;

public class Main {
    static void test(Gen<? extends A> obj) {
        // ...
    }
    public static void main(String[] args) {
    A a = new A("ClassA");
    B b = new B("ClassB");
    C c = new C("ClassC");
    D d = new D("ClassD");

    Gen<A> genA = new Gen<>(a);
    Gen<B> genB = new Gen<>(b);
    Gen<C> genC = new Gen<>(c);
    Gen<D> genD = new Gen<>(d);

    // Допустимые вызовы метода test
    test(genA);
    test(genB);
    test(genC);
    //System.out.println(a);
    // Недопустимый вызов метода test (genD не соответствует ограничению)
    test(genD); // Ошибка компиляции
    }
}
