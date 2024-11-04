import java.util.Scanner;

public class QPslFrase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        int pCounter = methodCounter(frase);
        System.out.println(pCounter);
    }
    public static int methodCounter(String frase)
    {
        int pCounter = 0;
        Boolean readingFlag = false;
        for (int i = 0; i < frase.length(); i++)
        {
            if (frase.charAt(i) == ' ')
            {
                readingFlag = false;
            }else if ( !readingFlag && frase.charAt(i) != ' ')
            {
                pCounter++;
                readingFlag = true;
            }
        }
        return pCounter;
    }
}
