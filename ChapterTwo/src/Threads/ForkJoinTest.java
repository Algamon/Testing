package Threads;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class MyForkJoin extends RecursiveAction{
    final int seq = 1000000;
    double mas[];
    int start,end;
    MyForkJoin(double[] mas,int start, int end){
        this.mas = mas;
        this.start = start;
        this.end = end;
    }
    @Override
    protected void compute() {
        if ((end-start)<seq){
            for (int i=start; i<end;i++){
                mas[i]=Math.sqrt(mas[i]);
            }
        }
        else {
            int middle = (start+end)/2;
            invokeAll(new MyForkJoin(mas,start,middle),
            new MyForkJoin(mas,middle,end));
        }
    }
}

public class ForkJoinTest {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        ForkJoinPool pool = new ForkJoinPool();
        System.out.println("Processors: "+ Runtime.getRuntime().availableProcessors());
        double[] mas = new double[100000000];
        for (int i=0;i<mas.length;i++){
            mas[i]=i;
        }
        for (int i=0;i<10;i++){
            System.out.print(mas[i]+" ");
        }
        System.out.println();
        pool.invoke(new MyForkJoin(mas,0,mas.length));
        for (int i=0;i<10;i++){
            System.out.format("%.4f ",mas[i]);
        }
        long time2 = System.currentTimeMillis();
        System.out.println();
        System.out.println("Time: "+(time2-time));
    }
}
