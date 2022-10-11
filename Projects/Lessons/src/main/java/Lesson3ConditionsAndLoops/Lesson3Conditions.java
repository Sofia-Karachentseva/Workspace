package Projects.Lessons.src.main.java.Lesson3ConditionsAndLoops;

public class Lesson3Conditions {

    public static void main(String[] args) {

        Lesson3Conditions lesson2 = new Lesson3Conditions();
        //lesson2.printUserInfo("John Smith", 1);
        boolean isBonusAvailable = true;
        lesson2.checkScore("John Smith", 1, 40, isBonusAvailable);
        lesson2.checkScore("Kevin Smith", 2, 50, isBonusAvailable);
        lesson2.checkScore("Lily Smith", 3, 60, isBonusAvailable);
        lesson2.checkScore("Mark Smith", 4, 101, isBonusAvailable);
        lesson2.checkScore("Nancy Smith", 5, -101, isBonusAvailable);



    }


    public void printUserInfo(String userName, int userId){

        System.out.println("The user name is " + userName);
        System.out.println("The user ID is " + userId);

    }


    public void checkScore(String userName, int userId, int userScore, boolean isBonusAvailable){
        System.out.println("The user name is " + userName);
        System.out.println("The user ID is " + userId);

        if(userName.equals("John Smith")){
            userScore = userScore + 20;
        }
        if(isBonusAvailable==true){
            userScore = userScore + 10;
        }
        if(userScore<0 || userScore>100){
            System.out.println("Error");
        }
        else if(userScore>=60){
            System.out.println("Pass!");
        }
        else {
            System.out.println("Fail!");
        }
    }
}
