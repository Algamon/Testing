package Threads;



public class ForkJoinTestWithout {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        double[] mas = new double[100000000];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++)
            mas[i] = Math.sqrt(mas[i]);
        for (int i = 0; i < 10; i++)
            System.out.format("%.4f ", mas[i]);
        long time2 = System.currentTimeMillis();
        System.out.println();
        System.out.println("Time: " + (time2 - time));
    }
}
