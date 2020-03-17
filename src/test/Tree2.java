package test;

/**
 * @author carrymaniac
 * @date Created in 17:10 2019-08-01
 * @description
 **/
public class Tree2 {
    public int findKthLargest(int[] nums, int k) {
        if(nums==null||nums.length==0){
            return -1;
        }
        if(nums.length==1){
            return nums[0];
        }
        return quickSearch(nums,0,nums.length-1,k);
    }
    int quickSearch(int[] nums,int left, int right ,int k){
        int index = partation(nums,left,right);
        if(index>k-1&&left<=right){
            return quickSearch(nums,left,index-1,k);
        }else if(index<k-1&&left<=right){
            return quickSearch(nums,index+1,right,k);
        }else if(index==k-1&&left<=right){
            return nums[index];
        }
        return -1;
    }
    int partation(int[] nums,int l, int r){
        int more = l-1;
        int less = r;
        while(l<less){
            if(nums[l]>nums[r]){
                swap(nums,++more,l++);
            }else if(nums[l]==nums[r]){
                l++;
            }else {
                swap(nums,--less,l);
            }
        }
        swap(nums,less,r);
        return more+1;
    }


    void swap(int[] nums, int l, int r){
        int temp = nums[l] ;
        nums[l] = nums[r];
        nums[r] = temp;
    }

    public static void main(String[] args) {
        Tree2 tree2 = new Tree2();
        int[] nums = new int[]{3,2,1,5,6,4};
        int kthLargest = tree2.findKthLargest(nums,3 );
        System.out.println(kthLargest);
    }

    /**
     * @author carrymaniac
     * @date Created in 17:10 2019-08-01
     * @description
     **/
    public static class Tree {
        public int findKthLargest(int[] nums, int k) {
            if(nums==null||nums.length==0){
                return -1;
            }
            return quickSearch(nums,0,nums.length-1,k);
        }
        int quickSearch(int[] nums,int left, int right ,int k){
            int index = partation(nums,left,right);
            if(index-left>k-1&&left<right){
                return quickSearch(nums,left,index-1,k);
            }else if(index-left<k-1&&left<right){
                return quickSearch(nums,index+1,right,k-(index-left+1));
            }else {
                return nums[index];
            }
        }
        int partation(int[] nums,int l, int r){
            int more = l-1;
            int less = r;
            while(l<less){
                if(nums[l]>nums[r]){
                    swap(nums,++more,l++);
                }else if(nums[l]==nums[r]){
                    l++;
                }else {
                    swap(nums,--less,l);
                }
            }
            swap(nums,less,r);
            return more-1;
        }


        void swap(int[] nums, int l, int r){
            int temp = nums[l] ;
            nums[l] = nums[r];
            nums[r] = temp;
        }

        public static void main(String[] args) {
            Tree tree = new Tree();
            int[] nums = new int[]{3,2,1,5,6,4};
            int kthLargest = tree.findKthLargest(nums, 2);
            System.out.println(kthLargest);
            for (int num:nums){
                System.out.println(num);
            }
        }

    }
}
