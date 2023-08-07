package practice20230606;

public class Test5 {
    public static void main(String[] args) {
        int[] score = {67,67,88,98,23,44};
        int min = 100;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i]>max){
                max = score[i];
            }
            if (score[i]<min){
                min = score[i];
            }
        }
        System.out.println("max="+max);
        System.out.println("min="+min);

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        sum=sum-min-max;
        int average = sum/4;
        System.out.println("average="+average);
    }
}
