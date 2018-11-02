package com.vi.springboottraining.test;

import org.bson.types.ObjectId;

import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
//        System.out.println(new BigInteger("2.8210396221114124e+28"));
        System.out.println((new ObjectId("5b271bb37afe1a4ab049da60")).toString());
    }
}
