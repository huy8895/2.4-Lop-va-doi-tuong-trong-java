package Xay_dung_lop_StopWatch;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        double currentSystemTime = System.currentTimeMillis();
        StopWatch stopWatch = new StopWatch(currentSystemTime);
        stopWatch.start();

        main.sortArray(100000);

        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
    public static void sortArray(int size){
        int[] array =new  int[size];
        for (int i = 0; i < size;i++){
            array[i] = (int) (Math.random() * size);
        }
        Arrays.sort(array);
    }
}
