import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args){
        //System.out.print("Helllo");
        Scanner scanner=new Scanner(System.in);
        ScientificCalculator scientificCalculator=new ScientificCalculator();
        int choice=0;
        boolean done=false;
        while(!done){
            System.out.print("\n------------Scientific Calculator-----------");
            System.out.print("\n1-Squareroot");
            System.out.print("\n2-Exit");
            System.out.print("\nEnter choice:");
            choice= scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.print("\nEnter a number:");
                    double number=scanner.nextDouble();
                    double sqrt=scientificCalculator.squareroot(number);
                    System.out.print("\nSquare root of "+number+" = "+sqrt);
                    break;

                case 2:
                    System.out.print("\nExiting......");
                    done=true;
                    break;
            }
        }

    }

    public double squareroot(double number){
        return Math.sqrt(number);
    }
}
