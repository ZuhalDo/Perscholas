import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("How many favorite things you have?");
        int fv = scanner.nextInt();
        String[] favorite = new String[fv];
        for (int i = 0; i < fv; i++) {
            System.out.print("Enter your favorite thing: ");
            favorite[i] = scanner.next();
        }
        System.out.println("Your favorite  things are: ");
        for (int i = 0; i < fv; i++) {
            System.out.print(favorite[i] + " ");
        }*/

        HumanBeing h1 = new HumanBeing();
        h1.setWeight(68);
        h1.setHeight(1.65f);
        h1.setBmi(calculateBmi(h1));
        System.out.println("Person has " + h1.getWeight() + " kgs and is " + h1.getHeight() +
                "meter in height, which results in BMI of " + h1.getBmi());
    }
        public static float calculateBmi(HumanBeing h1){
            return h1.getWeight()/ (h1.getHeight()* h1.getHeight());
        }

}