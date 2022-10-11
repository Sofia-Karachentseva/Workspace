package Projects.HW;

public class HW3 {
    public static void main(String[] args) {
        HW3 hw3 = new HW3();
        hw3.printPositiveIntegers();
        hw3.summary();
        hw3.piramids();
    }

    public void printPositiveIntegers() {
        int i;
        for (i = 1; i <= 100; i++) {

            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i + " divisible by two and three");
            } else if (i % 3 == 0) {
                System.out.println(i + " divisible by three");
            } else if (i % 2 == 0) {
                System.out.println(i + " even");
            } else {
                System.out.println(i + " odd");
            }
            System.out.println();
        }
    }

    public void summary() {
        int a = 4, b = 8;
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }
        System.out.println("The summary between 2 numbers:" + a + " " + "and" + " " + b + " " + "is" + " " + sum);
        System.out.println();
    }


    public void piramids() {
        for (int i = 6; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}


