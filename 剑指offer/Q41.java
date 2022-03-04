package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:45
 */

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 */
public class Q41 {
    /**
     * 输出所有和为S 的连续正数序列。序列内按照从小至大的顺序，序列
     * 间按照开始数字从小到大的顺序
     */

    @Test
    public void test(){
        System.out.println(FindContinuousSequence(15));



        int[] test={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(getSumEqual(test, 10)));
    }

    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum){
        ArrayList<ArrayList<Integer>> arrayList=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        if (sum < 3)
            return arrayList;


        int small = 1;
        int big = 2;
        while (small < (sum + 1) / 2) {
            int s = 0;

            for (int i = small; i <= big; i++) {
                s = s + i;
            }

            if (s == sum) {
                for (int i = small; i <= big; i++) {
                    list.add(i);
                }
                arrayList.add(new ArrayList<>(list));
                list.clear();
                small++;
            } else if (s > sum) {
                small++;
            } else {
                big++;
            }
        }


        return arrayList;
    }

    /**
     * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他
     * 们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
     */

    public int[] getSumEqual(int[] nums,int sum){
        int length=nums.length;
        int min=nums[length-2]*nums[length-1];
        int[] res=new int[2];
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for (int i=0;i<nums.length;i++){
            if (map.containsKey(sum-nums[i])){
                list.add(nums[i]);
                list.add(sum-nums[i]);
                if (getMul(list)<min){
                    min=getMul(list);
                    res[0]=list.get(0);
                    res[1]=list.get(1);
                }
                list.clear();
            }

        }
        return res;




    }
    public int getMul(ArrayList<Integer> list){
        int mul=1;
        for (int i:list){
            mul=mul*i;
        }
        return mul;
    }
}
