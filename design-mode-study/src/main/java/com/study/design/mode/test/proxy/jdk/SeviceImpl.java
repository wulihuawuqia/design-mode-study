/**
 * ��Ȩ����: �й����Ű�WiFi��Ӫ����
 * ��������: 2018/12/31
 * �������ߣ�wuqia
 * �ļ����ƣ�SeviceImpl.java
 * �汾: 1.0
 * �޸ļ�¼:
 */
package com.study.design.mode.test.proxy.jdk;

import java.time.LocalTime;

/**
 * Description: ����ʵ����.
 * @author wuqia
 * @since 2018/12/31
 */
public class SeviceImpl implements Sevice{

    @Override
    public void lookBook(String bookName) {
        LocalTime localTime = LocalTime.now();
        System.out.println("小明" + localTime + "���ڶ�����" + bookName + "��");
    }
}
