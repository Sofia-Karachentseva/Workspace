package Projects.Lessons.src.main.java.Lesson3ConditionsAndLoops;

public class Lesson3Loops {
    public static void main(String[] args) {

        Lesson3Loops loops = new Lesson3Loops();
        loops.countNumbers(1);
        loops.countNumbers();
        loops.numbersTemplate(9);
    }

    public void countNumbers(int i){

        //System.out.println(i);
        //System.out.println(i+1);
        //System.out.println(i+2);

        while (i <= 10){
            System.out.println(i);
            i = i + 1;
            //i++;
        }

    }
    public void countNumbers(){
        for(int i = 1; i<= 20; i++){
            System.out.println(i);
        }
    }

    public void numbersTemplate(int rows){
        for (int i = 1; i <= rows; i++){
            //if(i % 2 == 0){
            //    continue;
            //}
            if(i==7){
                break;
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j + "  ");
            }
            System.out.println();
        }
        }

    //1
    // 1 2
    // 1 2 3
}

