import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        // create random object
        Random randomObj = new Random();
        //for loop
        for (int i = 1; i < 6; i++) {
            int randomNumber = randomObj.nextInt(100000);
            System.out.println(i + " Ticket number : " + randomNumber);
        }
    }
}
