package Meter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class counter {
    public static void main(String[] args) {
        int count=0, N=-1;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> sort_list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for(;;){
            if (count>100000||count<0){
                System.out.println("Ошибка, допустимый диапозон измерения от 0 до 100000");
                System.exit(0);
            }
            count = in.nextInt();
            if(count==-1)break;
            list.add(count);
            N++;
        }
        if(N==-1){
            System.out.println("Ошибка, нулевое количество измерений");
            System.exit(0);
        }
        int M = list.get(0);
        if (M<2||M>14000||N<M||N>25000){
            System.out.println("Ошибка, допустимый интервал для M от 2 до 14000, для N от M до 25000");
            System.exit(0);
        }
        for (int i=1;i<=list.size()-M;i++){
            for (int x=0;x<M;x++){
                sort_list.add(x, list.get(x+i));
            }
            System.out.println(Collections.max(sort_list));
            sort_list.clear();
        }
    }
}
