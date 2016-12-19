package Threads;

import java.util.concurrent.Exchanger;

public class ExchangerTest {
    public static void main(String[] args) {
        Exchanger<Double> exch = new Exchanger<>();
        new ModuleOne(exch);
        new ModuleTwo(exch);
    }
}
class ModuleOne implements Runnable{
    private Exchanger<Double> exch;
    private Double mas[] = new Double[5];
    ModuleOne(Exchanger<Double> exch){
        this.exch = exch;
        new Thread(this).start();
        System.out.println("Start ModuleOne");
    }

    @Override
    public void run() {
        System.out.println("Start randomize: ");
        for (int i=0;i<mas.length;i++)
        {
            mas[i]=Math.random();
            System.out.print(mas[i]+" ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("End randomize.");
        for (int i = 0; i<mas.length;i++) {
            try {
                mas[i] = exch.exchange(mas[i]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class ModuleTwo implements Runnable{
    private Exchanger<Double> exch;
    ModuleTwo(Exchanger<Double> exch){
        this.exch = exch;
        new Thread(this).start();
        System.out.println("Start ModuleTwo");
    }

    @Override
    public void run() {

        Double x=null;
        for (int i = 0; i < 5; i++){
            try {
                x = exch.exchange(x);
                if (i==0) System.out.println("Start exchange: ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(x+" ");
        }
        System.out.println("End exchange.");
    }
}