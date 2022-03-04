

/**
 * @author fubibo
 * @create 2021-02-24 10:45
 */

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的
 * 旋转。输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。例如
 * 数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。NOTE：给出的所
 * 有元素都大于0，若数组大小为0，请返回-1。假设数组中不存在重复元素。
 */
public class Q8 {
    public static void main(String[] args) {
        int[] test={6,2,3,4,5};
        System.out.println(findMin(test));


    }
    public static int findMin(int[] nums){
        if (nums.length==0){
            return -1;
        }
        if (nums.length==1){
            return nums[0];
        }

        int left=0;
        int right=nums.length-1;

        while (left<right){
            int mid=(left+right)/2;
            if (nums[mid]>nums[right]){
                left=mid+1;
            }else {
                right=mid;
            }

        }
        return nums[left];
    }
}
