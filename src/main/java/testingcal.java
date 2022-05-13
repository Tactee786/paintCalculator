import java.util.Scanner;

public class testingcal {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // finding wall number
        double totalWallArea = 0.0;
        System.out.println("how many walls are you painting?");
        int numWalls = Integer.parseInt(myScanner.nextLine());
        for (int i = 0; i < numWalls; i++) {
            System.out.println("Wall number: " + (i + 1));
            System.out.print("what is the height of the wall " + (i + 1) + ": ");
            double wallHeight = Double.parseDouble(myScanner.nextLine());
            System.out.print("whit is the width of the wall " + (i + 1) + ": ");
            double wallWidth = Double.parseDouble(myScanner.nextLine());
            double wallArea = wallHeight * wallWidth;
            System.out.println(wallArea);
            System.out.println("the size of the wall " + (i + 1) + " is " + Math.round(wallArea * 100.0) / 100.0 + "m^2.");
            System.out.println(totalWallArea);
            totalWallArea = totalWallArea + wallArea;
            System.out.println(totalWallArea);
        }
    }
}