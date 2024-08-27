import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        FrequentIdexOfArray frequent = new FrequentIdexOfArray();

      ModelCreator modelCreator = new ModelCreator();
      String name = modelCreator.getPracticeBundle().getName();
      String family = modelCreator.getPracticeBundle().getFamily();
      int age = modelCreator.getPracticeBundle().getAge();

        int myEntry [] = {1, 2, 3, 4, 5, 8, 12, 1, 5, 8, 96, 25, 55, 11, 4, 4, 6, 8,
        12, 4, 5, 8, 9, 1, 4, 5, 4, 8, 8, 8, 8, 8, 8, 8, 98};







        System.out.println(frequent.findMostFrequent(myEntry));
        System.out.println(name);
        System.out.println(family);
        System.out.println(age);


    }
}