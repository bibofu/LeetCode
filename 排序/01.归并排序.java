//归并排序的实现

class Solution{
    public int[] merge(int[] arr){
        int left=0;
        int right=arr.length-1;
        int[] temp=new int[arr.length];
        sort(arr,left,right,temp);
        return arr;
    }

    public void sort(int[] arr,int left,int right,int[] temp){
        if(left<right){
            int mid=left+(right-left)/2;
            sort(arr,left,mid,temp);
            sort(arr,mid+1,right,temp);
            merge(arr,left,right,temp);
        }

    }


    //借助数组temp完成排序
    public void merge(int[] arr,int left,int right,int[] temp){
        int mid=left+(right-left)/2;
        int i=left;
        int j=mid+1;
        int t=0;
        
        while(i<=mid&&j<=right){
            if (arr[i]<arr[j]){
                temp[t]=arr[i];
                i++;
                t++;
            }else {
                temp[t]=arr[j];
                j++;
                t++;
            }

        }

        while (i<=mid){
            temp[t]=arr[i];
            i++;
            t++;
        }

        while (j<=right){
            temp[t]=arr[j];
            j++;
            t++;
        }

        t=0;
        while(left<=right){
            arr[left]=temp[t];
            left++;
            t++;
        }

    }

}

















