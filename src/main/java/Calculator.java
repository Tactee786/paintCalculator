import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        /* System.out.println("What is the size of the wall your painting?");
        double wallHeight = Double.parseDouble(myScanner.nextLine());
        double wallWidth = Double.parseDouble(myScanner.nextLine());
        double wallArea = wallHeight * wallWidth;
        System.out.println("the size of the wall is " + Math.round(wallArea*100.0)/100.0 + "m^2.");

        System.out.println("What is the area of the unpainted wall?");
        double wallUnpainted = Double.parseDouble(myScanner.nextLine());
        System.out.println("The area of unpainted wall is " + wallUnpainted + "m^2");

        double wallPaintArea = wallArea - wallUnpainted;
        System.out.println(wallPaintArea + "m^2 to be painted");

        System.out.println("you need on average 100ml of paint for 1m^2");
        double paint1m = 0.1d;
        double paintNeeded = wallPaintArea * paint1m;
        double paintNeededToBuy = Math.round(paintNeeded*100.0)/100.0;

        System.out.println( "You will need " + paintNeededToBuy + "L to paint your wall.");
        System.out.println("You will need to buy a " + Math. ceil(paintNeededToBuy) + "L bucket or larger to complete the wall.");
        */
        /*int x = 50;
        int y = 50;
        if (x==y){
            System.out.println("1");
        } else if (x>y) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }*/

        HashMap<String, ArrayList> areas = new HashMap<String, ArrayList>();
        ArrayList<Double> walls = new ArrayList<Double>();
        areas.put("paintLayers", walls);
        walls.add(0, 3.3d);
        walls.add(1, 4.7d);
        areas.replace("paintLayers", walls);
        walls = areas.get("paintLayers");
        for (Double a: walls
             ) {
            System.out.println(a);
        }
        System.out.println(areas.get("paintLayers"));
        System.out.println(areas);

    }
}
