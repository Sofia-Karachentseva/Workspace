package Projects.HW;

public class HW4 {
    public static void main(String[] args) {
        HW4 hw4 = new HW4();
        hw4.compareStrings("Category", "Cat");

        boolean success = hw4.isPalindrome("Kayak");
        System.out.println(success);
    }

    public void compareStrings(String a, String b) {
        if (a == null || b == null) {
            System.out.println("Can't compare Strings");
        } else if (a.equalsIgnoreCase(b)) {
            System.out.println("The Strings are the same");
        } else if (a.contains(b)) {
            System.out.println(b + " is the part of " + a);
        }
    }

    public boolean isPalindrome(String text) {
        boolean success = false;
        if (text == null || text.isBlank() || text.isEmpty()) {
            System.out.println("The String is empty or null");
        } else {
            String result = "";
            int reverse = text.length() - 1;
            for (int i = reverse; i >= 0; i--) {
                result = result + text.charAt(i);
                if (text.equalsIgnoreCase(result)) {
                    success = true;
                }
            }
        }
        return success;
    }
}






