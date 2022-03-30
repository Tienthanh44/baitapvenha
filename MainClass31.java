public class MainClass31 {
    public static void main(String[] args) {

        int [][] arr = {
                {1,5,7,8,-1},
                {4,9,-1,-1,1},
                {3,4,6,7,9},
        };
        printSquare(arr);
       /** sortDecending(arr); */
       arrangeArray(arr);

        int total = calculate(arr);
        System.out.println("Total :"+total);
        int max = maxNumber(arr);
        System.out.println("Số lần xuất hiện số lớn nhất: " + max);
        int min = minNumber(arr);
        System.out.println("Số lần xuất hiện số bé nhất: " + min);

    }
    public static int calculate(int [][] arr){
        int total = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                if(i==1){
                    total = total +arr[i][j];
                }
            }
        }
        return total;
    }
    public static void printSquare(int[][] arr) {
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                if (j==3){
                    break;
                }
                System.out.println(arr[i][j]);
            }
        }

    }
    public static int maxNumber(int [][] arr){
        int max = 0;
        int x = arr[0][0];
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                if (x<arr[i][j]){
                    x= arr[i][j];
                }
            }
        }
        for (int i=0;i<3;i++){
            for(int j =0;j<5;j++){
                if(arr[i][j]==x){
                    max ++;
                }
            }
        }
        return max;
    }
    public static int minNumber(int [][] arr){
        int min = 0;
        int z = arr[0][0];
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                if (z>arr[i][j]){
                    z= arr[i][j];
                }
            }
        }
        for (int i=0;i<3;i++){
            for(int j =0;j<5;j++){
                if(arr[i][j]==z){
                    min ++;
                }
            }
        }
        return min;
    }
    /**public static void sortDecending(int[][] arr) {
        int temp = 0;
        for(int i=0;i<4;i++){
            for(int j =0;j<4;j++){
                temp = 0;
                for(int k=j+1;k<5;k++){
                    if(arr[i][j]<arr[i][k]){
                        temp=arr[i][j];
                        arr[i][j]=arr[i][k];
                        arr[i][k]=temp;
                    }
                }
            }
        }
        System.out.println("Mảng sắp xếp giảm dần theo chiều từ trái sang phái: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.println(+arr[i][j]);
            }
        }
    }*/
    public static void arrangeArray(int[][] arr) {
        int n = 0;
        int [] b= new int[n];
        for (int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                b[i*n+j]=arr[i][j];
                n++;
            }
        }
        int temp = 0;
        for(int z=0;z<n-1;z++){
            for(int k=z+1;k<n;k++){
                if(b[z]>b[k]){
                    temp=b[z];
                    b[z]=b[k];
                    b[k]=temp;
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=b[i*n+j];
                n++;
            }
        }
        System.out.println("Mảng sau khi sắp xếp : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.println(arr[i][j]);
            }
        }
    }


}
