package com.company;
import java.util.*;
/**
 * Created by fs279 on 1/9/17.
 */
public class lesson36 {
    /*
    exception
    throwing exceptions
    IllegalArgumentException e = new IllegalArgumentException();
    throw e; stops entire program
    checked exception
    java requires handling
    can't be controlled or prevented
    unchecked
    not my fault
    throws exception in method signature
    catch exception
     */
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Give me numbers.");
        if (!in.hasNextInt()) {
            System.out.println("I said numbers!");
            IllegalArgumentException e = new IllegalArgumentException();
            throw e;
        }
    }
}
