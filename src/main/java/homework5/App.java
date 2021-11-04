package homework5;


import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        App app = new App();
        app.metod1();
        app.metod2();
    }

    public void metod1() {
        final int size = 10000000;
        final int h = size / 2;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Время выполнения метода 1: "+(System.currentTimeMillis() - a));

    }
    public void metod2() {
        final int size = 10000000;
        final int h = size / 2;
        float[] arr = new float[size];
        float[] a1 =new float[h];
        float[] a2 =new float[h];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=1;
        }
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        Calc c1 =new Calc(a1);
        Calc c2 = new Calc(a2);
        c1.start();
        c2.start();
        try {
            c1.join();
            c2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(c1.getArr(), 0,arr , 0, h);
        System.arraycopy(c2.getArr(), 0,arr, h, h);
        System.out.println("Время выполнения метода 2: "+(System.currentTimeMillis() - a));
    }
}
class Calc extends Thread{
    final float[] arr;

    Calc(float[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    public float[] getArr(){
        return arr;
    }
}

