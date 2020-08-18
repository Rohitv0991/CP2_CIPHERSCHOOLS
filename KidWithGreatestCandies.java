/*For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest number of candies among them.
Notice that multiple kids can have the greatest number of candies.

Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] */

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> canMax = new ArrayList<>(candies.length);
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < candies.length; i++) {
            if(candies[i] > max) max = candies[i];
        }
        for(int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= max) canMax.add(true);
            else canMax.add(false);
        }
        return canMax;
    }
}
