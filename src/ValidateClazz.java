import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClazz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter class name:");
        String input = sc.nextLine();
        String regex = "(^[CAP]) ([0-9]{4})([GHIKLM]$)";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(input);
        boolean result = match.find();
        System.out.println(result);
    }
}
