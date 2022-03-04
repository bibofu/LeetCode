package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:57
 */

/**
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，
 * 那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数
 * 值，那么中位数就是所有数值排序之后中间两个数的平均值。
 */

import org.junit.Test;

import java.util.*;

/**
 * 思路1：创建优先级队列维护大顶堆和小顶堆两个堆，并且小顶堆的值都大于大顶
 * 堆的值，2 个堆个数的差值小于等于1，所以当插入个数为奇数时：大顶堆个数就
 * 比小顶堆多1，中位数就是大顶堆堆头；当插入个数为偶数时，使大顶堆个数跟小
 * 顶堆个数一样，中位数就是2 个堆堆头平均数。也可使用集合类的排序方法。
 */
public class Q64 {


    List<Double> list = new ArrayList<Double>();
    public void Insert(Integer num) {

        list.add(Double.valueOf(num));
        Collections.sort(list);
    }
    public Double GetMedian() {
        double res = 0;
        int len = list.size();
        if(len==1){
            res = list.get(0);
        }
        else if (len % 2 == 0) {
            int temp = len / 2;
            res = (list.get(temp-1) + list.get(temp )) / 2.0;
        } else {
            int temp = (len + 1) / 2;
            res = list.get(temp-1);
        }
        return res;
    }




}
