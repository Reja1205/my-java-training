package com.metroplus.health;

public class TyoeOfConversion {
    //byte>short>int>long>float>double>bolean>char
    //Type  compatible
    //Destination>source type
    //lower size to bigger size==widening/implicit
    //bigger size to lower size==narrowing/explicit

    public static void main(String[] args) {
        byte a=10;
        int b=a;
        System.out.println(b);


        int e=10;
        byte f= (byte) e;
        System.out.println(f);

    }
}
