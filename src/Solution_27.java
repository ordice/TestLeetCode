/**
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
public class Solution_27 {

    public static void main(String[] args) {
        Solution_27 solution = new Solution_27();
        int ans = solution.removeElement(new int[]{1,2,3,2,2,25,5,2,2,4,2,5},2);    //12 6
        Util.print(ans);
    }

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = nums.length - 1 ; i <= j ;){
            if (nums[i] == val){
                if (nums[j] != val){
                    nums[i++] = nums[j--];
                }
                else{
                    j--;
                    continue;
                }
            } else i++;
        }
        return i;
    }
}
