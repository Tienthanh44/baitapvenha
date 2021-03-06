public class Homework123 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, -22, 2, -6, 19, 3, 5, 9, 10};

        // new array
        int[] array = new int[]{5, 4, -22, 2, -6, 19, 3, 5, 9, 10};

        // homework 1
        calculateAverage(array);

        // homework 2
        findMax(array);
        // homework 3
        findMin(array);
        // homework 4
        findSquare(array);
        // homework 5
        changeNegativeNumber(array);
        // homework 6
        deleteNegativeNumber(array);
        // homework 7
        accendingArray(array);

    }

    /**
     * Tính trung bình cộng các số lẻ ở vị trí chẵn
     */
    public static void calculateAverage(int arr[]) {
        float x = 0;
        float y = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 == 0 && arr[i] % 2 != 0) {
                y++;
                x = x + arr[i];
            }
        }
        System.out.println("Dap an cau 1 : " + (x / y));
    }

    /**
     * Tìm số lớn nhất trong mảng vừa nhập
     *
     * @param arr
     */
    public static void findMax(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        System.out.println("So lon nhat la " + max);
    }

    /**
     * Tìm vị trí số nhỏ nhất trong mảng
     */
    public static void findMin(int arr[]) {
        int h = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
                h = i;
            }
        }
        System.out.println("Vi tri so nho nhat la " + h);
    }

    /**
     * Đếm số chính phương
     */
    public static void findSquare(int arr[]) {
        int l = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j <= arr[i]; j++) {
                if ((arr[i] % j == 0) && (arr[i] / j == j)) {
                    l++;
                }

            }
        }
        System.out.println("So so chinh phuong la " + l);
    }

    /**
     * Thay phan tu âm = 0
     *
     * @param arr
     */
    public static void changeNegativeNumber(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        System.out.println("Day so moi la ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(" " + arr[i]);
        }
    }

    /**
     * Xóa phần tử âm
     */
    public static void deleteNegativeNumber(int arr[]) {
        int p=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<0){
                p++;
            }
        }
        int ard[] = new int[p] ;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<p;j++){
                if(arr[i]<0){
                    ard[j]=arr[i+1];
                }
            }
        }
        System.out.println("Mang sau khi xoa la ");
        for (int j = 0; j < p; j++) {
            System.out.println(ard[j] + " ");
        }

    }



    /**
     * Sắp xếp dãy tăng dần
     */
    public static void accendingArray(int arr[]) {
        int flag = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    flag = arr[j];
                    arr[j] = arr[i];
                    arr[i] = flag;
                }
            }
        }
        System.out.println("Day so tang dan la ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i] + " ");
        }
    }


}



