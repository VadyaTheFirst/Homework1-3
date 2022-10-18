public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte[] arr0 = new byte[3];
        arr0[0] = 1;
        arr0[1] = 2;
        arr0[2] = 3;

        double[] arr1 = {1.57, 7.654, 9.986};

        char[] arr2 = {'a', 'b', 'c', 'd'};

        //Задача 2

        for (byte i = 0; i < (arr0.length); i++) {
            if (i == arr0.length - 1) {
                System.out.println(arr0[i]);
            } else {
                System.out.print(arr0[i] + ",");
            }
        }
        for (byte i = 0; i < (arr1.length); i++) {
            if (i == arr1.length - 1) {
                System.out.println(arr1[i]);
            } else {
                System.out.print(arr1[i] + ",");
            }
        }
        for (byte i = 0; i < (arr2.length); i++) {
            if (i == arr2.length - 1) {
                System.out.println(arr2[i]);
            } else {
                System.out.print(arr2[i] + ",");
            }
        }
        //Задача 3
        for (int i = (arr0.length-1); i >=0; i--) {
            if (i == 0) {
                System.out.println(arr0[i]);
            } else {
                System.out.print(arr0[i] + ",");
            }
        }
        for (int i = (arr1.length-1); i >=0; i--) {
            if (i == 0) {
                System.out.println(arr1[i]);
            } else {
                System.out.print(arr1[i] + ",");
            }
        }
        for (int i = (arr2.length-1); i >=0; i--) {
            if (i == 0) {
                System.out.println(arr2[i]);
            } else {
                System.out.print(arr2[i] + ",");
            }
        }
        //Задача 4
        for (byte i=0;i<arr0.length;i++){
            if (arr0[i]%2!=0){
                arr0[i]++;
            }
            System.out.print(arr0[i]+" ");
        }

    }
}