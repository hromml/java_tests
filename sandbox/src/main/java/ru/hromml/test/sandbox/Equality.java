package ru.hromml.test.sandbox;

import java.util.Objects;

/**
 * Created by HROM on 18.03.2017.
 */
public class Equality {
    public static void main(String[] args){
        String s1="firefox";
        String s2=new String(s1);

        System.out.println(s1==s2);
        System.out.println(Objects.equals(s1, s2));
    }
}
