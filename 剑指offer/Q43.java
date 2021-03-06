package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:47
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 把n 个骰子扔在地上，所有骰子朝上一面的点数之和为s,输入n,打印
 * 出s 的所有可能出现的概率
 */
public class Q43 {
    public static void main(String[] args) {

        Map<Integer, Double> integerDoubleMap = printProbability(4);
        integerDoubleMap.forEach((key,value)->{
            System.out.println(key+": "+value);
        });
    }

    public static Map<Integer, Double> printProbability(int number) {
        Map<Integer, Double> probabilityMap = new HashMap<>();
        if (number < 1) {
            return probabilityMap;
        }
        int g_maxValue = 6;
        int[][] probabilities = new int[2][];
        probabilities[0] = new int[g_maxValue * number + 1];
        probabilities[1] = new int[g_maxValue * number + 1];
        int flag = 0;


        /** 当第一次抛掷骰子时，有6 种可能，每种可能出现一次
         *  第一个骰子投完的结果存到了probabilities[0]
         */


        for (int i = 1; i <= g_maxValue; i++) {
            probabilities[0][i] = 1;
        }

        //从第二次开始掷骰子，假设第一个数组中的第n 个数字表示骰子和为n 出现的次数，

        for (int k = 2; k <= number; ++k) {

        // 第k 次掷骰子，和最小为k，小于k 的情况是不可能发生的,令不可能发生的次数设置为0！

            for (int i = 0; i < k; ++i) {
                probabilities[1 - flag][i] = 0;
            }
            // 第k 次掷骰子，和最小为k，最大为g_maxValue*k
            for (int i = k; i <= g_maxValue * k; ++i) {
               // 初始化，因为这个数组要重复使用，上一次的值要清0
                probabilities[1 - flag][i] = 0;
                for (int j = 1; j <= i && j <= g_maxValue; ++j)
                probabilities[1 - flag][i] += probabilities[flag][i - j];
            }
            // 若flag=0，1-flag 用的就是数组1，而flag=1，1-flag 用的就是数组0
            flag = 1 - flag;
        }
        double total = Math.pow(g_maxValue, number);
        for (int sum = number; sum <= g_maxValue * number; sum++) {
            double ratio = (double) probabilities[flag][sum] / total;
            probabilityMap.put(sum, ratio);
        }
        return probabilityMap;
    }
}
