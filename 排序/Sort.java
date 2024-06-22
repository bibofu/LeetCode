class Sort{

    /** 常见的排序算法 */
    public void swap(int[] nums,int i,int j){
        
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        
    }

/************ 选择排序 *************/
    public void selSort(int[] nums){
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[i]){
                    swap(nums,i,j);
                }
            }
        }
        for(int i:nums){
            System.out.println(i);
        }
    }

/************ 冒泡排序 *************/
    public void bubSort(int[] nums){
        int n = nums.length;
        for(int i =0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                if(nums[j] > nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }
        for(int i:nums){
            System.out.println(i+" ");
        }

    }

    

/************ 插入排序 *************/
    public void insertSort(int[] nums){ 
        int n =nums.length;
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(nums[j-1]>nums[j]){
                    swap(nums,j-1,j);
                }
            }
        }
        for(int i:nums){
            System.out.println(i);
        }
        
    }
/************ 归并排序 *************/
    public void mergeSort(int[] nums){
        int[] temp = new int[nums.length];
        sort(nums,0,nums.length-1,temp);
        for(int i:nums){
            System.out.println(i+" ");;
        }
    }

    public void sort(int[] nums,int left,int right,int[] temp){
        if (left<right){
            int mid = left+(right-left)/2;
            sort(nums,left,mid,temp);
            sort(nums,mid+1,right,temp);
            merge(nums,left,right,temp);
        }
    }

    /** 对nums中 [left,right]区间进行排序 */
    public void merge(int[] nums,int left,int right,int[] temp){
        int mid = left+(right-left)/2;
        int i =left;
        int j =mid+1;
        int t = 0;
        while(i<=mid&&j<=right){
            if(nums[i]<nums[j]){
                temp[t]=nums[i];
                i++;
                t++;
            }else{
                temp[t] = nums[j];
                j++;
                t++;
            }
        }
        while (i<=mid){
            temp[t]=nums[i];
            i++;
            t++;
        }
        while (j<=right){
            temp[t]=nums[j];
            j++;
            t++;
        }
        t=0;
        while(left<=right){
            nums[left]=temp[t];
            t++;
            left++;
        }
    }

/************ 快速排序 *************/
    public void quickSort(int[] nums){
        int[] res = quick(nums,0,nums.length-1);
        for(int i:res){
            System.out.println(i+" ");
        }
    }

    /** ---------------- 递归快排 ---------------- */
    public int[] quick(int[] arr,int left,int right){
        if(left<right){
            int find=partition(arr,left,right);
            quick(arr,left,find-1);
            quick(arr,find+1,right)
        }
        return arr;
    }
    //example
    //arr={4,5,3,1,7} left=0,right=4
    //arr= 4 1 3 5 7
    //arr= 3 1 4 5 7
    //把小于pivot的值放到左边，大于的放到右边，返回pivot对应的索引
    public int partition(int[] arr,int left,int right){
        int pivot=arr[left];
        int start=left;
        while(left<right){
            while(left<right&&arr[right]>=pivot){
                right--;
            }

            while(left<right&&arr[left]<=pivot){
                left++;
            }

            if(left>=right){
                break;
            }
            swap(arr,left,right);
        }

        swap(arr,start,left);
        return left;

    }
    
    /************ 堆排序 *************/
    public void heapSort(int[] nums){

    }

}