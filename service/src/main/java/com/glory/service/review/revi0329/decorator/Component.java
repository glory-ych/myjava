package com.glory.service.review.revi0329.decorator;

/**
 * Created by yangch on 2017/3/29 0029.
 */
public abstract class Component {
    abstract void exec();
}
//public interface Component {
//    void operate();
//}
//public class ConcreteComponent implements Component{
//    @Override
//    public void operate(){
//        //di
//    }
//}
//public class Decorator implements Component{
//    private Component component;
//    public Decorator(Component component){
//        this.component=component;
//    }
//    @Override
//    public void operate(){
//        //do
//    }
//}
//public class ConcreteDecorator1 implements Decorator{
//    public ConcreteDecorator1(Component component){
//        super(component);
//    }
//    @Override
//    public void operate(){
//        //do
//        super.operate();
//    }
//}
//public class ConcreteDecorator2 implements Decorator{
//    public ConcreteDecorator1(Component component){
//        super(component);
//    }
//    @Override
//    public void operate(){
//        //do
//        super.operate();
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        Component component=new ConcreteComponent();
//        component=new ConcreteDecorator1(comopnent);
//        component=new ConcreteDecorator2(comopnent);
//        component.operate();
//    }
//}