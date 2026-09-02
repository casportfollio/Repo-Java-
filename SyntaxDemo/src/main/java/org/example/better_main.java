package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class better_main {
    public static void main(String[] args) {
        int a = 2147483647;
        int neg_a = -2147483648;
        long c = 111234567890L;
        short b = 32767;
        short neg_b = -32768;
        byte d = 127;
        byte neg_d = -128;

        double dd= 3.1415; //more accurate
        float f= 3.14F; //faster
        boolean bool = true;
        char ch = 'a';


        int[] int_array = {1,2,3,4,5,6,7};

        for (int i = 0;i < int_array.length; i++) {
            System.out.println(int_array[i]);
        }
        for (int i: int_array) {
            System.out.println(i);
        }

        List<Integer> dyn_list = new ArrayList<>();
        dyn_list.add(1);
        dyn_list.add(2);
        dyn_list.add(7);
        dyn_list.add(117);
        dyn_list.add(67);
        dyn_list.add(777);

        for(int i : dyn_list) {
            System.out.println(i);
        }
        for (Integer integer : dyn_list) {
            System.out.println(integer);
        }
    }
}