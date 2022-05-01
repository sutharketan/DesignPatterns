package shape_example;

public class Client
{
    public static void main(String[] args) {
        ShapeCache.loadCache();

        var shape1 = ShapeCache.getShape("1");
        System.out.println("shape1: " + shape1.getType());
        shape1.draw();

        var shape2 = ShapeCache.getShape("2");
        System.out.println("shape1: " + shape2.getType());
        shape2.draw();

        var shape3 = ShapeCache.getShape("3");
        System.out.println("shape1: " + shape3.getType());
        shape3.draw();
    }
}
