package test.com.study.design.mode.samples;

import com.study.design.mode.samples.decorator.ConcreteComponent;
import com.study.design.mode.samples.decorator.Decorator;
import com.study.design.mode.samples.decorator.DecoratorA;
import com.study.design.mode.samples.decorator.DecoratorB;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class DecoratorATest {

    Logger logger = Logger.getLogger(getClass().getName());

    @Test
    public void methodA() {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        DecoratorA decoratorA = new DecoratorA(concreteComponent);
        logger.info(decoratorA.methodA());
        logger.info(decoratorA.methodB() + "");
        DecoratorB decoratorB = new DecoratorB(decoratorA);
        logger.info(decoratorB.methodA());
        logger.info(decoratorB.methodB()+ "");
    }
}