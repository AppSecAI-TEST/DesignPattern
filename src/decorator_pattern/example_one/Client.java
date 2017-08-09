package decorator_pattern.example_one;

/**
 * 客户调用类
 * Created by Niwa on 2017/8/8.
 */
public class Client {
    public static void main(String[] args) {
        //构造被装饰的组件对象
        Component component = new ConcreteComponent();

        //根据组件对象构造装饰者对象A并调用，此时相当于给组件对象增加装饰A的功能方法
        Decorator decorator = new ConcreteDecoratorA(component);
        decorator.operate();

        //根据组件对象构造装饰者对象A并调用，此时相当于给组件对象增加装饰A的功能方法
        Decorator decoratorB = new ConcreteDecoratorB(component);
        decoratorB.operate();
    }
}
