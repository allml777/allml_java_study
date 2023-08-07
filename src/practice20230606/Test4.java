package practice20230606;

public class Test4 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,23,6,45,32,55};
        int[] arr2 = new int[arr1.length];
//        for (int i = 0; i < arr1.length; i++) {
//            arr2[i] = arr1[i];
//        }
        arr2 =arr1;

        arr1[3]=74;
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf(arr2[i]+"\t");
        }

        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf(arr1[i]+"\t");
        }
    }
}
