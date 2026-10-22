 import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        int length = 10;

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "@#$%^&*";

        String allCharacters = upper + lower + numbers + symbols;

        Random random = new Random();
        String password = "";

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allCharacters.length());
            password += allCharacters.charAt(index);
        }

        System.out.println("Generated Password : " + password);
    }
}