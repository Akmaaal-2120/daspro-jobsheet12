import java.util.Scanner;
public class CinemaWithScanner15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row, column, opt;
        String name, next;
        String[][] audience = new String[4][2];
        boolean occupied = false;

        while (true){
            System.out.println("MENU ");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Choose 1-3 : ");
            opt = sc.nextInt();
            sc.nextLine();

            if(opt == 1){
                System.out.print("Enter a name: ");
                name = sc.nextLine();
                do {
                    
                    System.out.print("Enter row number : ");
                    row = sc.nextInt();
                    System.out.print("Enter column number : ");
                    column = sc.nextInt();
                    sc.nextLine(); 

                    if (row < 1 || row > 4 || column < 1 || column > 2) {
                        System.out.println("No seats available.");
                    } else {
                        if (audience[row - 1][column - 1] != null) {
                            System.out.println("This seat is already occupied");
                            occupied = true;
                        } else {
                            audience[row - 1][column - 1] = name;
                            occupied = false;
                        }
                    }
                } while (occupied); 
                  System.out.print("Are there any other audiences to be added? (y/n): ");
                    next = sc.nextLine();

                    if(next.equalsIgnoreCase("n")){
                        break;
                    }

            }else if(opt == 2){
                for(int i = 0; i < audience.length; i++){
                    for(int j = 0; j < audience[i].length; j++){
                        if(audience[i][j] == null){
                            audience[i][j] = "***";
                       
                        }
                        System.out.println("Seat " + (i + 1) + ", " + (j + 1) + " : " + audience[i][j]);
                }
            }
        }else if(opt == 3){
            break;
        }else{
            System.out.println("Choose correctly.");
        }

    }
}
}
