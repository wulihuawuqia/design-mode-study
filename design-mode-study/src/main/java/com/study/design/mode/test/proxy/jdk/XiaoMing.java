/**
 * ???????: ?й??????WiFi???????
 * ????????: 2018/12/31
 * ?????????wuqia
 * ????????XiaoMing.java
 * ?汾: 1.0
 * ?????:
 */
package com.study.design.mode.test.proxy.jdk;

/**
 * Description: ??????С??.
 * @author wuqia
 * @since 2018/12/31
 */
public class XiaoMing {

    public static void main(String[] args) {
        Sevice sevice = (Sevice)SeviceProxy.getProxy(new SeviceImpl());
        sevice.lookBook("亚里士多德");
    }
    
}
