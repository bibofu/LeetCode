/*
 * @lc app=leetcode.cn id=380 lang=java
 *
 * [380] O(1) 时间插入、删除和获取随机元素
 */

// @lc code=start
class RandomizedSet {
    Set set;
    Random random;
    public RandomizedSet() {
        this.set = new HashSet<Integer>();
        this.random = new Random();
    }
    
    public boolean insert(int val) {
        if(set.contains(val)){
            return false;
        }else{
            set.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(set.contains(val)){
            set.remove(val);
            return true;
        }else{
            return false;
        }
    }
    
    public int getRandom() {
        int n = set.size();
        int index = random.nextInt(n);
        Object[] nums = set.toArray();
        return (int)nums[index];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
// @lc code=end

