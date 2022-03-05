// 快速排序的两种实现


//递归

class Solution{

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

    public void swap(int[] arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}

//非递归

class Solution{

    public int[] quick(int[] arr){
        Stack<Integer> stack=new Stack<>();
        stack.push(arr.length-1);
        stack.push(0);
        while(!stack.isEmpty()){
            int lo=stack.pop();
            int hi=stack.pop();
            if(lo<hi){
                int index=partition(arr,lo,hi);
                stack.push(index-1);
                stack.push(lo);
                stack.push(hi);
                stack.push(index+1);

            }
        }

        return arr;
    }




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


    public void swap(int[] arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }




}
