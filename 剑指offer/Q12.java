

/**
 * @author fubibo
 * @create 2021-02-24 11:16
 */

/**
 * 输入数字n，按顺序打印从1 到最大的n 位数十进制数，比如：输入
 * 3，打印出1 到999.
 */
public class Q12 {
    public static void main(String[] args) {
        pringArray(2);

    }
    public static void pringArray(int n){
        int max=0;
        while (n>0){
            max=max*10+9;
            n--;
        }

        int[] array=new int[max];

        for (int i=0;i<max;i++){
            array[i]=i+1;
        }
        for (int i = 0; i < max; i++) {
            System.out.println(array[i]);

        }

    }


}
