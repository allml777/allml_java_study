import java.util.Arrays;

//  现在有如下一个数组：
//  int   oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}，
//  要求将以上数组中值为0的项去掉，将不为0的值存入一个新的数组，生成的新数组为：
//  int  newArr[]={1,3,4,5,6,6,5,4,7,6,7,5}

public class OldArray {
    public static void main (String[] args){
        OldArray b = new OldArray();
        b.a();
    }

    void a(){
        int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int count = 0;
        for (int i = 0;i < oldArr.length;i++){
            if(oldArr[i]!=0){
                count++;
            }
        }
        int newArr[] = new int[count];
        int a = 0;
        for (int i = 0;i < oldArr.length;i++){
            if(oldArr[i]!=0){
                newArr[a] = oldArr[i];
                a++;
            }
        }

        System.out.println(Arrays.toString(newArr));
        for(int n:newArr) {
            System.out.print(n+" ");
        }

    }

}
