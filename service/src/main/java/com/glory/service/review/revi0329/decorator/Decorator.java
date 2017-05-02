package com.glory.service.review.revi0329.decorator;

/**
 * Created by yangch on 2017/3/29 0029.
 */
public class Decorator extends Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    void exec() {

    }

//    @Override
//    public void exec() {
//        this.component.exec();
//    }
}
