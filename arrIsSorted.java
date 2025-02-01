public class arrIsSorted {
    public static void main(String[] args) {
        //EXTRA
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        // System.out.println(max+" "+min);


        //is Sorted or not

        // boolean flag=false;
        int[] arr = {5, 2, 3, 4, 5};
        // for(int i=0;i<arr.length-1;i++){
        //     if(arr[i]>arr[i+1]){
        //         flag=true;
        //         break;
        //     }
        // }
        // if(flag==false){
        //     System.out.println("Array is sorted");
        // }else{
        //     System.out.println("Array is not sorted");
        // }


        //Reverse and arr

        // int l=arr.length-1;
        // int n = Math.floorDiv(l, 2);
        // for(int i=0;i<n;i++){
        //         int temp=arr[i];
        //         arr[i]=arr[l-i];
        //         arr[l-i]=temp;
        // }

        //OR
        int i=0,l=arr.length-1;
        while(i<l){
            int temp=arr[i];
            arr[i]=arr[l];
            arr[l]=temp;
            i++;
            l--;
        }

        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        
    }
}
