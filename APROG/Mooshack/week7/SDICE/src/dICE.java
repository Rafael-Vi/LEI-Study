import java.util.Scanner;

public class dICE
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String sides = sc.nextLine();
        int points = afterRolls(sides);
        System.out.println("points=" +points);
    }
    public static int afterRolls(String sides)
    {
        int points = 0;
        char lastRoll = sides.charAt(0);
        boolean isNegative = false;
        boolean altered = false;
        for (int i = 0; i < sides.length(); i++)
        {
            if (i==0){
                points += Character.getNumericValue(lastRoll);
            }
            else if (sides.charAt(i) == lastRoll)
            {
                if (altered == false){
                    points = -points;
                    altered = true;
                }

                if (isNegative)
                {
                    points -= Character.getNumericValue(sides.charAt(i));
                    isNegative = false;
                }
                else
                {
                    isNegative = true;
                    points -= Character.getNumericValue(sides.charAt(i));
                }

            }
            else
            {
                points += Character.getNumericValue(sides.charAt(i));
            }
            lastRoll = sides.charAt(i);
        }

        return points;
    }
}
