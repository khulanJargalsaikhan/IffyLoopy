import java.util.Scanner;

public class IffyLoopy {

    public static void main(String[] args) {
        //IffyLoopy
        Scanner input = new Scanner(System.in);

        String redEyes, response;
        boolean isSleepy = false;

        System.out.println("Enter 5 words: ");
        String str = input.nextLine();

        System.out.println(str);

        do {
            System.out.println("Are your eyes red? y/n");
            redEyes = input.next();
            input.nextLine();
            if (redEyes.equals("y")) {
                System.out.println("Get some sleep!");
                isSleepy = true;
            } else {
                System.out.println("You look great!");
                isSleepy = false;
            }

            System.out.println("Do you want to try again? y/n");
            response = input.nextLine();

        }while(isSleepy == true && response.equals("y"));


    }
}
