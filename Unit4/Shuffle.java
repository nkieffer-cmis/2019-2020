public class Shuffle
{
    public static void main(String[] argv){
        int[] nums = new int[100];
        int i;
        for(i = 0; i < nums.length; i++){
            nums[i] = i;
        }
        nums[--i] = -1;
        int its = 0;
        int[] top = new int[nums.length / 2];
        int t = 0;
        int b = 0;
        int[] bottom = new int[nums.length / 2];
        while(!ordered(nums)){
            for(int idx = 0; idx < nums.length; idx++){
                if(idx % 2 == 0){
                    top[++t] = nums[idx];
                } else {
                    bottom[++b] = nums[idx];
                }
            }
            for(int idx = 0; idx < nums.length; idx++){
                if(idx < t){
                    nums[idx] = top[idx];
                }else{
                    nums[idx] = bottom[idx-b];
                }
                System.out.print(nums[idx] + " ");
            }
            System.out.println();
        }
    }
    
    public static boolean ordered(int[] nums){
        for(int i = 0; i < nums.length -1; i++){
            if(nums[i] > nums[i+1]){
                return false;
            }
        }
        return true;
    }
}

