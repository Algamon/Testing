package Threads;

import java.util.ArrayList;
import java.util.Optional;

public class TestReduce {
    public static void main(String[] args) {
        ArrayList<Integer> mas = new ArrayList<>();
        mas.add(4);
        mas.add(1);
        mas.add(9);
        mas.add(19);
        mas.add(6);
        mas.sort(Integer::compareTo);
        for (int x: mas)
            System.out.print(x+ " ");
        System.out.println();
        Optional<Integer> obj1 = mas.stream().reduce((a,b)->(a*b));
        if(obj1.isPresent())
            System.out.println(obj1.get());
    }
}
