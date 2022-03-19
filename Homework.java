public class HomeWork {
    public static void main(String[] args) {
        // new array
        int[] array = new int[]{5,4,-22,2,-6,19,3,5,9,10};

        // homework 1
        calculateAverage(array);

        // homework 2
        findMax(array);
    }

    /**
     * Tính trung bình cộng các số lẻ ở vị trí chẵn
     */
    public static void calculateAverage(int arr[]) {
        float x = 0;
        float y = 0;
        for (int i = 0; i < arr.length -1; i++){
            if (i % 2 == 0 && arr[i]%2 != 0){
                y++;
                x=x+arr[i];
            }
        }
        System.out.println("Dap an cau 1 : " +(x/y));
    }

    /**
     * Tìm số lớn nhất trong mảng vừa nhập
     * @param arr
     */
    public static void findMax(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if( max < arr[i]){
                max = arr[i];
            }

        }
        System.out.println("So lon nhat la " + max);
    }
}
