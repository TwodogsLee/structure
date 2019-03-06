package com.demo.doublelink;

public class DoubleLinkTest {

    public static void main(String[] args){
        DoubleLink dl = new DoubleLink();

        dl.appendLast(1);
        System.out.println(dl.mCount);
        System.out.println(dl.mHead);
    }
}
