package Projects.Lessons.src.main.java.Lesson4Strings;

public class Lesson4Strings {
    public static void main(String[] args) {
        Lesson4Strings strings = new Lesson4Strings();
        int res = strings.sumOfTwoNumbers(2, 4);
        System.out.println("The result is " + res);

        System.out.println(strings.getText());
    }

    public int sumOfTwoNumbers(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public String getText() {
        return "blablabla";
    }
}
