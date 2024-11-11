/*
 * @lc app=leetcode.cn id=690 lang=java
 *
 * [690] 员工的重要性
 */

// @lc code=start
/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer,Employee> map = new HashMap<>();
        
        int res = 0;
        for(Employee e:employees){
            map.put(e.id,e);
        }
        Queue<Employee> q = new LinkedList<>();
        q.offer(map.get(id));
        while(!q.isEmpty()){
            Employee e = q.poll();
            res += e.importance;
            if(e.subordinates != null){
                for(int i=0;i<e.subordinates.size();i++){
                    q.offer(map.get(e.subordinates.get(i)));
                }
            }
        }
        return res;
    }
}
// @lc code=end

