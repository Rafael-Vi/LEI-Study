import java.util.Scanner;

public class Condo {
    public static final int FLOORS = 4;
    public static final int ENTRANCES = 3;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] array = readFillArray(sc);
        searchForhabitant(array ,sc.nextLine());
    }
    public static String[][] readFillArray( Scanner sc){
       String[][] array = new String[ENTRANCES][FLOORS];
        for(int i = 0; i < ENTRANCES; i++){
            for(int j = 0; j < FLOORS; j++){
                array[i][j] = sc.nextLine();
            }
        }
        return array;
    }
    public static void searchForhabitant(String[][] array, String name){
        int counter =0;
        for(int i = 0; i < ENTRANCES; i++){
            for(int j = 0; j < FLOORS; j++){
                if(array[i][j].equals(name)){
                    System.out.println("name="+name);
                    System.out.println("entrance=" + i);
                    System.out.println("floor=" + j);
                    counter++;
                }
            }
        }
        if (counter == 0)
        System.out.println("Do not live in the building");
    }
}
