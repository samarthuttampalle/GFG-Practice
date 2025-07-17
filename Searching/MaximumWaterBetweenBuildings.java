public class MaximumWaterBetweenBuildings {
    static int maxWater(int height[], int n) {
        // Your code here
        if(n<2){
            return 0;
        }
        int left = 0;
        int right = n-1;
        int maxWater = 0;
        while(left<=right){
            int minHeight = Math.min(height[left], height[right]);
            int width = right-left-1;
            int water = minHeight * width;
            maxWater = Math.max(water,maxWater);
            
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
    
}
