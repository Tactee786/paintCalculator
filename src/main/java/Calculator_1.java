import java.util.HashMap;
import java.util.Scanner;

public class Calculator_1 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        HashMap<String, Double> areas = new HashMap<String, Double>();
        areas.put("paintLayers", 0.0);
        areas.put("totalWallArea", 0.0);
        areas.put("totalDoorArea", 0.0);
        areas.put("totalWindowArea", 0.0);
        areas.put("totalFixtureArea", 0.0);
        areas.put("totalNotPaintedArea", 0.0);
        areas.put("totalPaintedArea", 0.0);
        areas.put("paintNeeded", 0.0);
        areas.put("paintNeededToBuy", 0.0);
        call(areas);
    }

    static void call(HashMap<String, Double> areas){
        wall(areas);
        door(areas);
        window(areas);
        fixture(areas);
        notPainted(areas);
        painted(areas);
        paintAmountNeeded(areas);
        paintToBuy(areas);
        System.out.println("The amount of paint needed to paint the wall/s with " + areas.get("paintLayers") + " coats is " + areas.get("paintNeeded") + " Liters.");
        System.out.println("You will need to buy a " + areas.get("paintNeededToBuy") + " Liter bucket or larger to paint your wall/s." );
        System.out.println(areas);
    }

    private static void exit() {
    }

    static HashMap wall(HashMap<String, Double> areas) {
        Scanner myScanner = new Scanner(System.in);
        double totalWallArea = 0.0;
        System.out.print("how many walls are you painting: ");
        int numWalls = myScanner.nextInt();
        if (numWalls>0){
            for (int i = 0; i < numWalls; i++) {
                System.out.println("Wall number: " + (i + 1));
                System.out.print("what is the height of the wall in meters" + (i + 1) + ": ");
                double wallHeight = myScanner.nextDouble();
                System.out.print("what is the width of the wall in meters" + (i + 1) + ": ");
                double wallWidth = myScanner.nextDouble();
                Double wallArea = wallHeight * wallWidth;
                System.out.println("the size of the wall " + (i + 1) + " is " + Math.round(wallArea * 100.0) / 100.0 + " m^2.");
                totalWallArea = totalWallArea + wallArea;
            }
            areas.replace("totalWallArea", totalWallArea);

            System.out.print("how many coats are you doing: ");
            Double paintLayers = myScanner.nextDouble();
            areas.replace("paintLayers", paintLayers);
            return areas;

        }else if (numWalls<=0){
            System.out.println("Bye");
            exit();
        }
        return areas;
    }

    static HashMap door(HashMap<String, Double> areas) {
        Scanner myScanner = new Scanner(System.in);
        double totalDoorArea = 0.0;
        System.out.print("how many doors: ");
        int numDoors = myScanner.nextInt();
        if (numDoors>0){
            for (int i = 0; i < numDoors; i++){
                System.out.print("what is the height of the door in meters: ");
                double doorHeight = myScanner.nextDouble();
                System.out.print("what is the width of the door in meters: ");
                double doorWidth = myScanner.nextDouble();
                Double doorArea = doorHeight * doorWidth;
                totalDoorArea = totalDoorArea + doorArea;
            }
            areas.replace("totalDoorArea", totalDoorArea);
            return areas;
        }else if (numDoors<0){
            return areas;
        }
        return areas;
    }

    static HashMap window(HashMap<String, Double> areas) {
        Scanner myScanner = new Scanner(System.in);
        double totalWindowArea = 0.0;
        System.out.print("how many windows: ");
        int numWindows = myScanner.nextInt();
        if (numWindows>0){
            for (int i = 0; i < numWindows; i++){
                System.out.print("what is the height of the window in meters: ");
                double windowHeight = myScanner.nextDouble();
                System.out.print("what is the width of the window in meters: ");
                double windowWidth = myScanner.nextDouble();
                Double windowArea = windowHeight * windowWidth;
                totalWindowArea = totalWindowArea + windowArea;
            }
            areas.replace("totalWindowArea", totalWindowArea);
            return areas;
        }else if (numWindows<0){
            return areas;
        }
        return areas;
    }

    static HashMap fixture(HashMap<String, Double> areas) {
        Scanner myScanner = new Scanner(System.in);
        double totalFixtureArea = 0.0;
        System.out.print("how many fixtures: ");
        int numFixtures = myScanner.nextInt();
        if (numFixtures>0){
            for (int i = 0; i < numFixtures; i++){
                System.out.print("what is the height of the fixture in meters: ");
                double fixtureHeight = myScanner.nextDouble();
                System.out.print("what is the width of the fixture in meters: ");
                double fixtureWidth = myScanner.nextDouble();
                Double fixtureArea = fixtureHeight * fixtureWidth;
                totalFixtureArea = totalFixtureArea + fixtureArea;
            }
            areas.replace("totalFixtureArea", totalFixtureArea);
            return areas;
        }else if (numFixtures<0){
            return areas;
        }
        return areas;
    }

    static HashMap notPainted(HashMap<String, Double> areas) {
        Double excludedArea = areas.get("totalDoorArea") + areas.get("totalWindowArea") + areas.get("totalFixtureArea");
        areas.replace("totalNotPaintedArea", excludedArea);
        return areas;
    }

    static HashMap painted(HashMap<String, Double> areas) {
        Double paintedArea = areas.get("totalWallArea") - areas.get("totalNotPaintedArea");
        paintedArea = Math.round(paintedArea*100.0)/100.0;
        areas.replace("totalPaintedArea", paintedArea);
        return areas;
    }

    static HashMap paintAmountNeeded(HashMap<String, Double> areas) {
        Double paintNeeded = ((areas.get("totalPaintedArea")) * 0.1) * areas.get("paintLayers");
        paintNeeded = Math.round(paintNeeded*100.0)/100.0;
        areas.replace("paintNeeded", paintNeeded);
        return areas;
    }

    static HashMap paintToBuy(HashMap<String, Double> areas) {
        Double paintNeededToBuy = ((areas.get("totalPaintedArea")) * 0.1) * areas.get("paintLayers");
        paintNeededToBuy = Math.ceil((Math.round(paintNeededToBuy*100.0)/100.0));
        areas.replace("paintNeededToBuy", paintNeededToBuy);
        return areas;
    }



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
