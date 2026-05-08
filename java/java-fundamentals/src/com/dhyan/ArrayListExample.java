package com.dhyan;
import java.util.ArrayList ;
import java.util.Scanner;

public class ArrayListExample {
    public static void main (String[] args){
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10) ;
        Scanner in  = new Scanner(System.in);
//            list.add(33);
//            list.add(232);
//            list.add(24);
//            list.add(22);
//            list.add(33);
//            list.add(232);
//            list.add(24);
//            list.add(22);
//            list.add(33);
//            list.add(232);
//            list.add(24);
//            list.add(22);
//            list.add(33);
//            list.add(232);
//            list.add(24);
//            list.add(22);
//            list.add(33);
//            list.add(232);
//            list.add(24);
//            list.add(22);
//
//            System.out.println(list.contains(282));
//            list.set(1, 44);
//            list.remove(3);
//            System.out.println(list)

            //input
            for (int i =0 ; i< 5 ; i++){
                list.add(in.nextInt());
            }

            //get any item at any index
        for ( int i = 0 ; i< 5; i++){
            System.out.println(list.get(i)); // pass index here , list [ Index ] will not work here 
        }
        System.out.println(list);
        }
    }

