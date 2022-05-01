package shape_example;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache
{
    private ShapeCache(){}

    private static final Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId)
    {
        final var cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache(){
        var circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        var square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        var rec = new Rectangle();
        rec.setId("3");
        shapeMap.put(rec.getId(), rec);
    }
}
