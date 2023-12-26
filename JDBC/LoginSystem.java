import java.util.Scanner;
import java.util.Random;

class LoginSystem implements ILogin {
    private String username = "username";
    private String password = "password";
    private Scanner input = new Scanner(System.in);
    private Random random = new Random();

    @Override
    public void inputLogin() {
        boolean loginSuccess = false;

        while (!loginSuccess) {
         
            System.out.print("Enter your username: ");
            String enteredUsername = input.nextLine();

            System.out.print("Enter your password: ");
            String enteredPassword = input.nextLine();

            if (username.equals(enteredUsername) && password.equals(enteredPassword)) {
                System.out.println("Account Found!");
                loginSuccess = true; 
            } else {
                System.out.println("Invalid username or password Please try again.");
            }
            String captchaCode = generateCaptcha();
            System.out.println("CAPTCHA Code: " + captchaCode);
           
            System.out.print("Enter the CAPTCHA code: ");
            String enteredCaptcha = input.nextLine();

            if (captchaCode.equals(enteredCaptcha)) {
                System.out.println("Login Success!");
                loginSuccess = true; 
            } else {
                System.out.println("You are robot");
            }
        }
    }

    private String generateCaptcha() {
        // Generate a random 4-digit CAPTCHA code
        int captchaNumber = 1000 + random.nextInt(9000);
        return String.valueOf(captchaNumber);
    }
}
