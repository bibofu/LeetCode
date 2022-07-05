/*
 * @lc app=leetcode.cn id=729 lang=java
 *
 * [729] 我的日程安排表 I
 */

// @lc code=start
class MyCalendar {

    List<int[]> booked;

    public MyCalendar() {
        booked = new ArrayList<int[]>();
    }
    
    public boolean book(int start, int end) {
        for(int[] arr : booked){
            int l=arr[0];
            int r=arr[1];
            if(l<end && start<r){
                return false;
            }
        }

        booked.add(new int[]{start,end});
        return true;

    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
// @lc code=end

