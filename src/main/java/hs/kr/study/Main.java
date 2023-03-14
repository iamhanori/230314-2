package hs.kr.study;

import hs.kr.study.beans.jpop;
import hs.kr.study.beans.kpop;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        kpop k1 = ctx.getBean("k1", kpop.class);
        k1.Sound();
        jpop j1 = ctx.getBean("j1", jpop.class);
        j1.Sound();

        System.out.println("Hello world!");
    }
}