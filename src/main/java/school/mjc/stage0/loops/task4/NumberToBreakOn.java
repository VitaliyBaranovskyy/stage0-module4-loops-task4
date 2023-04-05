package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        int i;
      if (  numberToGoUntil < toBreakWith){
          System.out.println("iterating till the end");
      }
      for (i = 1; i <= numberToGoUntil; i++){
          if (i == toBreakWith){
              break;
          }
          System.out.print(i + " ");
      }
    }
    
    public static void main (String [] args){
      NumberToBreakOn main = new NumberToBreakOn();
        main.printNumbersUntilWithBreakOn(7,15);
    }
}
