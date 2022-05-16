import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class Calculator_1Test {

    @Test
    void paintToBuy() {
        var Cal = new Calculator_1();
        HashMap<String, Double> areas = new HashMap<String, Double>();
        areas.put("paintLayers", 3.0);
        areas.put("totalWallArea", 0.0);
        areas.put("totalDoorArea", 0.0);
        areas.put("totalWindowArea", 0.0);
        areas.put("totalFixtureArea", 0.0);
        areas.put("totalNotPaintedArea", 0.0);
        areas.put("totalPaintedArea", 40.0);
        areas.put("paintNeeded", 0.0);
        areas.put("paintNeededToBuy", 12.0);
        assertEquals(areas.get("paintNeededToBuy"), (Calculator_1.paintToBuy(areas)).get("paintNeededToBuy"));
    }
}