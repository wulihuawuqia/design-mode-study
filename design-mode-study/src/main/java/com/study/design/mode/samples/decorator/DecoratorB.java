/**
 * 版权所有: 中国电信爱WiFi运营中心
 * 创建日期: 2018/12/23
 * 创建作者：wuqia
 * 文件名称：DecoratorB.java
 * 版本: 1.0
 * 修改记录:
 */
package com.study.design.mode.samples.decorator;

/**
 * Description: 适配器B.
 * @author wuqia
 * @since 2018/12/23
 */
public class DecoratorB extends Decorator{

    public DecoratorB(Component component) {
        super(component);
    }

    @Override
    public String methodA() {
        return super.methodA() + " + b";
    }

    @Override
    public int methodB() {
        return super.methodB() + 20;
    }
}
