package test;

import test.array;

import java.util.*;

public class arruse {

    public static void main(String[] args) {
        Object o=new Object();

        Apple apple = new Apple();
        String b=apple.toString();
        System.out.println(b);
    }
    public String convertToTitle(int n) {
        StringBuilder stringBuilder =new StringBuilder();
        while(n>0){
            int tmp=n%25;
            n=n/26;
            char c=(char)('A'+tmp);
            stringBuilder.append(c);
        }
        return stringBuilder.toString();

    }
}
class Apple{
    @Override
    public String toString() {
        return "apple 不好吃";
    }
}
