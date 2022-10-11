package Projects.Lessons.src.main.java.Lesson5;

import java.util.*;

public class ArrayExamples {

    public void stringsArray() {

        String[] buttons = {"OK", "Cancel", "Login", "SignUp"};

        buttons[2] = "Exit";

        int length = buttons.length;

        System.out.println(buttons[2]);

        System.out.println(String.format("The array length is %s", length));


        for (int i = 0; i < buttons.length; i++) {
            System.out.println(buttons[i]);
        }

        for (String button : buttons) {
            System.out.println(button);
        }

    }

    public void stringsArrayWithSize() {

        String[] array = new String[7];
        array[0] = "OK";
        array[1] = "Cancel";
        array[2] = "Login";
        array[3] = "SignUp";
        array[4] = "";

        System.out.println(String.format("The length is %s", array.length));

    }

    public void integerArray() {
        int[] ids = {0, 1, 2, 3};
        System.out.println(ids[2]);
    }

    public void arrayListExample() {

        ArrayList<String> buttons = new ArrayList<String>();
        buttons.add("OK");
        buttons.add("Cancel");
        buttons.add("Login");
        buttons.add("SignUp");

        System.out.println(buttons.get(0));


        for (int i = 0; i < buttons.size(); i++) {
            System.out.println(buttons.get(i));
        }


        for (String button : buttons) {
            System.out.println(button);
        }

        System.out.println("The size of the list is " + buttons.size());


        buttons.add("Exit");

        for (String button : buttons) {
            System.out.println(button);
        }

        buttons.remove("SignUp");

        for (String button : buttons) {
            System.out.println(button);
        }

        buttons.clear();

        System.out.println(buttons.size());
    }

    public void arrayListSortingExample() {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(123);
        arrayList.add(12);
        arrayList.add(23);
        arrayList.add(333);

        Collections.sort(arrayList);
        for (Integer i : arrayList) {
            System.out.println(i);
        }
    }
    public void hashMapExample() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("John", "New York");
        hashMap.put("Natasha", "Moscow");
        hashMap.put("Sofia", "Calgary");
        System.out.println(hashMap);

        System.out.println(hashMap.get("Sofia"));

        hashMap.remove("John");

        System.out.println(hashMap.size());
    }
    public void hashSetExample() {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("John");
        hashSet.add("Natasha");
        hashSet.add("Sofia");
        System.out.println(hashSet);

        List<String> list = new ArrayList<String>(hashSet);
        Collections.sort(list);
        System.out.println(list);
    }
}
