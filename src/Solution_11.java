/**
 * @author ordice
 * @title: Solution_11
 * @projectName LeetCodeTest
 * @description: TODO
 * @date 2019/5/9 23:45
 */
/**
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器，且 n 的值至少为 2
 */
public class Solution_11 {
    public int maxArea(int[] height) {
        int max = 0;
        for(int l = 0 , r = height.length - 1 , width = height.length - 1; l != r ; width--){
            if (height[l] <= height[r]) {
                if (max < height[l++] * width) {
                    max = height[l - 1] * width;
                }
            } else if (height[l] > height[r]) {
                if (max < height[r--] * width) {
                    max = height[r + 1] * width;
                }
            }
        }
        return max;
    }
}