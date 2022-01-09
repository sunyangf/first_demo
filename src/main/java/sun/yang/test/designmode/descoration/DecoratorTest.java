package sun.yang.test.designmode.descoration;

public class DecoratorTest {
    public static void main(String[] args) {
        Component component=new ConcreteDecorator(new ConcretComponent());
        component.biu();
    }
}
