public class Task_findMinMax {
    int[] arr = {10, 20, 45, 63, 78, 1, 12, 32, 4};
    int max;
    int min;
    void display(){
        System.out.print("Array= ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    int Max() {
        max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    int Min() {
        min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
    int SecondLargest() {
        int max2 = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max2 && j < max) {
                max2 = j;
            }
        }
        return max2;
    }
    int ThirdLargest() {
        int max2 = SecondLargest();
        int max3 = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max3 && j < max2) {
                max3 = j;
            }
        }
        return max3;
    }
    int SecondMin(){
        int min2=Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < min2 && j > min) {
                min2 = j;
            }
        }
        return min2;
    }
    int ThirdMin() {
        int min2 = SecondMin();
        int min3 = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < min3 && j > min2) {
                min3 = j;
            }
        }
        return min3;
    }
    public static void main(String[] args) {
        Task_findMinMax ob = new Task_findMinMax();
        ob.display();
        System.out.println("\nMax = " + ob.Max());
        System.out.println("Second Max = " + ob.SecondLargest());
        System.out.println("Third Max = " + ob.ThirdLargest());
        System.out.println("Min = " + ob.Min());
        System.out.println("Second Min = " + ob.SecondMin());
        System.out.println("Third Min = " + ob.ThirdMin());
    }
}