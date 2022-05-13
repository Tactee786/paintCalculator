import java.util.Scanner;

public class Calculator_1 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        // finding wall number
        double totalWallArea = 0.0;
        double totalDoorArea = 0.0;
        double totalWindowArea = 0.0;

        // handling window
        System.out.print("how many windows are there in the wall: ");
        int numWindows = myScanner.nextInt();

        // handling socket
        System.out.print("how many sockets are there in the wall: ");
        int numSockets = myScanner.nextInt();

        /*System.out.print("What is the area of the unpainted wall?");
        double wallUnpainted = myScanner.nextDouble();
        System.out.println("The area of unpainted wall is " + wallUnpainted + "m^2");

        double wallPaintArea = wallArea - wallUnpainted;
        System.out.println(wallPaintArea + "m^2 to be painted");

        System.out.println("you need on average 100ml of paint for 1m^2");
        double paint1m = 0.1d;
        double paintNeeded = wallPaintArea * paint1m;
        double paintNeededToBuy = Math.round(paintNeeded*100.0)/100.0;

        System.out.println( "You will need " + paintNeededToBuy + "L to paint your wall.");
        System.out.println("You will need to buy a " + Math. ceil(paintNeededToBuy) + "L bucket or larger to complete the wall.");*/

    }

    private static void exit() {
    }

    static double wall() {
        Scanner myScanner = new Scanner(System.in);
        double totalWallArea = 0.0;
        // finding wall number
        System.out.print("how many walls are you painting: ");
        int numWalls = myScanner.nextInt();
        if (numWalls>0){
            for (int i = 0; i < numWalls; i++) {
                System.out.println("Wall number: " + (i + 1));
                System.out.print("what is the height of the wall " + (i + 1) + ": ");
                double wallHeight = myScanner.nextDouble();
                System.out.print("whit is the width of the wall " + (i + 1) + ": ");
                double wallWidth = myScanner.nextDouble();
                double wallArea = wallHeight * wallWidth;
                System.out.println("the size of the wall " + (i + 1) + " is " + Math.round(wallArea * 100.0) / 100.0 + " m^2.");
                totalWallArea = totalWallArea + wallArea;
            }

            return totalWallArea;

        }else if (numWalls<=0){
            System.out.println("Bye");
            exit();
        }
        return 0;
    }

    static double door() {
        Scanner myScanner = new Scanner(System.in);
        double totalDoorArea = 0.0;
        System.out.println("door things");
        // finding out the door number
        System.out.print("how many doors: ");
        int numDoors = myScanner.nextInt();
        if (numDoors>0){
            for (int i = 0; i <= numDoors; i++){
                System.out.print("what is the height of the door: ");
                double doorHeight = myScanner.nextDouble();
                System.out.print("whit is the width of the door: ");
                double doorWidth = myScanner.nextDouble();
                double doorArea = doorHeight * doorWidth;
                totalDoorArea = totalDoorArea + doorArea;
            }
            return totalDoorArea;
        }else if (numDoors<0){
            return 0;
        }
        return 0;
    }

    static double window() {
        Scanner myScanner = new Scanner(System.in);
        double totalWindowArea = 0.0;
        System.out.println("window things");
        // finding out the window number
        System.out.print("how many windows: ");
        int numWindows = myScanner.nextInt();
        if (numWindows>0){
            for (int i = 0; i <= numWindows; i++){
                System.out.print("what is the height of the door: ");
                double windowHeight = myScanner.nextDouble();
                System.out.print("whit is the width of the door: ");
                double windowWidth = myScanner.nextDouble();
                double windowArea = windowHeight * windowWidth;
                totalWindowArea = totalWindowArea + windowArea;
            }
            return totalWindowArea;
        }else if (numWindows<0){
            return 0;
        }
        return 0;
    }

    static double socket() {
        System.out.println("window things");
        return 0;
    }

    static double notPainted() {
        System.out.println("window things");
        return 0;
    }
}
