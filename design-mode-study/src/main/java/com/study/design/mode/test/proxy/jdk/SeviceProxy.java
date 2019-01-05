/**
 * ��Ȩ����: �й����Ű�WiFi��Ӫ����
 * ��������: 2018/12/31
 * �������ߣ�wuqia
 * �ļ����ƣ�SeviceProxy.java
 * �汾: 1.0
 * �޸ļ�¼:
 */
package com.study.design.mode.test.proxy.jdk;


import org.apache.tools.ant.taskdefs.Tar;

import java.lang.annotation.Target;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;

/**
 * Description: ����.
 * @author wuqia
 * @since 2018/12/31
 */
public class SeviceProxy {

    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new MyInvacationHandler(target));
    }

    static class MyInvacationHandler implements InvocationHandler {

        private Object target;

        MyInvacationHandler(Object target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            befor();
            Object res = method.invoke(target, args);
            after();
            return res;
        }

        void befor() {
            System.out.println("����֮ǰ");
        }

        void after(){
            System.out.println("����֮��");
        }

    }


}
