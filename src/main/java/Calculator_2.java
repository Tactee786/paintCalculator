import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Calculator_2 {

    public static void main(String[] args) {

        HashMap<String, ArrayList> house = new HashMap<String, ArrayList>();
        //rooms not needed as you normally calculate 1 room at a time I believe
        //ArrayList<Double> rooms = new ArrayList<Double>();
        ArrayList<Double> walls = new ArrayList<Double>();
        ArrayList<Double> layers = new ArrayList<Double>();
        ArrayList<Double> doors = new ArrayList<Double>();
        ArrayList<Double> windows = new ArrayList<Double>();
        ArrayList<Double> fixtures = new ArrayList<Double>();
        ArrayList<Double> totalNotPaintedAreas = new ArrayList<Double>();
        ArrayList<Double> totalPaintedAreas = new ArrayList<Double>();
        ArrayList<Double> paintNeeded = new ArrayList<Double>();
        ArrayList<Double> paintNeededToBuy = new ArrayList<Double>();

        house.put("totalWallArea", walls);
        house.put("layersOfPaint", layers);
        house.put("totalDoorArea", walls);
        house.put("totalWindowArea", walls);
        house.put("totalFixtureArea", walls);
        house.put("totalAreaNotPainted", walls);
        house.put("totalAreaPainted", walls);
        house.put("paintNeeded", walls);
        house.put("paintNeededToBuy", walls);





    }
    public static void call(HashMap<String, ArrayList> house){

    }

    /*
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
        */

}
