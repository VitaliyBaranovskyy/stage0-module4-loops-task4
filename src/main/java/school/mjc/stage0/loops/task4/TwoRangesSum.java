package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
       int i;
        int sum = 0;
        if (numberToSkip > lastInRow){
            System.out.println("number to skip is bigger then the last");
            if (lastInRow < 0)
                System.out.println("last number in row is negative");
        }
        
        else {
            for (i =1; i <=lastInRow; i++){
                if (i == numberToSkip){
                    continue;
                }
                if (numberToSkip > lastInRow){
                    break;
                }
                System.out.print(i + " ");
                  sum = sum + i;
            }
            System.out.println('\n' + "skip number = " + numberToSkip);
            System.out.println("sum = " + " " + sum);
        }
        
    }
    public static void main (String [] args){
        TwoRangesSum main = new TwoRangesSum();
        main.printSumOfTwoRanges(7,15);
    }
}
