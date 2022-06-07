package lab_06;

import java.util.Scanner;

//lab6.2
public class PasswordRetry {
    public static void main(String[] args) {
        String myPassword = "password123";

        Scanner scanner = new Scanner(System.in);
        int countRetries = 0;
        int maxRetries = 3;
        boolean matched = false;
        while(countRetries<maxRetries && matched == false){
            System.out.println("Re-enter password: ");
            String input = scanner.nextLine();
            if(input.equals(myPassword)){
                System.out.println(" >> Welcome !!");
                break;
            }else countRetries++;

        }

    }
}
