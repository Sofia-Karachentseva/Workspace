package Projects.HW;

import java.util.*;

public class HW5 {
    public static void main(String[] args) {
        HW5 weekDays = new HW5();
        System.out.println(weekDays.getDay(2));
        HW5 toyStore = new HW5();
        System.out.println(toyStore.getToyById(6));

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the Toy ID: ");
//
//        int id = Integer.parseInt(scanner.next());

        HW5 printNames = new HW5();
        System.out.println(printNames.getNames());
    }

    public String getDay(int day) {
        ArrayList<String> days = new ArrayList<>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

        String result = (days.get(day - 1));
        return result;
    }

    public String getToyById(int id) {

        HashMap<Integer, String> getToy = new HashMap<Integer, String>();

        getToy.put(12, "Batmobile");
        getToy.put(45, "Light Saber");
        getToy.put(6, "Wonder Woman");
        getToy.put(201, "Hello Kitty Bag");
        getToy.put(56, "Junior QA Analyst Doll");

        if (getToy.get(id) != null) {
            return getToy.get(id);
        } else {
            return "No such toy";
        }
    }

    public String getNames() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Steve");
        names.add("Tim");
        names.add("Lucy");
        names.add("Steve");
        names.add("Pat");
        names.add("Angela");
        names.add("Tom");
        names.add("Tim");
        names.add("Anna");
        names.add("Lucy");
        Collections.sort(names);
        HashSet<String> list = new HashSet<>(names);
        names.clear();
        names.addAll(list);
        //System.out.println(list);
        return "" + list;
    }
}










