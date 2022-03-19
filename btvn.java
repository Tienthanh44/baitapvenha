public class btvn {
    public static void main(String[] args) {
        int[] arr = new int[]{5,4,-22,2,-6,19,3,5,9,10};

        float x = 0;
        float y = 0;
        for (int i = 0; i < arr.length -1; i++){
            if (i % 2 == 0 && arr[i]%2 != 0){
                y++;
                x=x+arr[i];
            }
        }
        System.out.println("Dap an cau 1 : " +(x/y));

        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if( max < arr[i]){
                max = arr[i];
            }

        }
        System.out.println("So lon nhat la " + max);

        int h = 0 ;
        int min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if( arr[i] < min){
                min = arr[i];
                h = i;
            }
        }
        System.out.println("Vi tri so nho nhat la " + h);

       for (int i=0;i<arr.length -1;i++){
           for (int j=1;j<=arr[i];j++){
               if((arr[i]%j==0) && (arr[i]/j==j)){
                   System.out.println(  "La so chinh phuong" + arr[i]);
               }
               else {
                   System.out.println("Khong la so chinh phuong" + arr[i]);
               }
           }
        }
       //for (int i=0;i<arr.length-1;i++){
         //  if(arr[i]<0){
           //    arr[i] = 0;
           //}
       //}
       //System.out.println("Day so moi la ");
       //for(int i=0;i<arr.length-1;i++){
         //  System.out.println(" " +arr[i]);
       //}
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]<0){
                arr[i] = arr[i+1];
                i--;
            }
        }
        System.out.println("Day so moi la ");
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]+ " " );
        }
        int flag = arr[0];
        for(int i = 0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    flag=arr[j];
                    arr[j]=arr[i];
                    arr[i]=flag;
                }
            }
        }
        System.out.println("Day so tang dan la ");
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]+ " " );
        }


    }
}
