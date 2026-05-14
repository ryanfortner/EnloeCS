import java.util.Scanner;

public class LogIn
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // hardcode username/password
        final String username = "algoskater";
        final String password = "777word";
        
        // check password conditions
        // check for numbers
        int digitCount = 0;
        for (int i = 0; i < password.length() - 1; i++) {
            if (Character.isDigit(password.charAt(i))) {
                digitCount++;
            }
        }
        if (digitCount < 3 || digitCount > 3) {
            System.out.printf("Error: password contains incorrect number of digits.\n");
            System.exit(1);
        }
        // check for letters
        
        
        // read in username & password from user
        System.out.printf("Enter username:\n");
        String inputUsername = input.next();
        System.out.printf("Enter password:\n");
        String inputPassword = input.next();
        
        // remove whitespace from input strings
        inputUsername = inputUsername.trim();
        inputPassword = inputPassword.trim();
        
        // check username & password against hardcoded values
        if (inputUsername.equals(username)) {
            if (inputPassword.equals(password)) {
                System.out.printf("Welcome %s!\n", username);
            } else {
                System.out.printf("Login attempt failed (incorrect password).\n");
                System.exit(1);
            }
        } else {
            System.out.printf("Login attempt failed (incorrect username).\n");
            System.exit(1);
        }
        
        // find position of the number
        String f = "";
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                f = f + password.charAt(i);
            }
        }
        
        int num = Integer.parseInt(f);
        
        if ((num) == 0) {
            System.out.printf("Password number %d is even\n", num);
        } else {
            System.out.printf("Password number %d is odd\n", num);
        }
    }
}
