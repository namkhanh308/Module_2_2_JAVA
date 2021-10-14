public class Test {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape square = shapeFactory.getShape(3,3);
        square.draw();
        Shape rectangle = shapeFactory.getShape(4,5);
        rectangle.draw();
        Shape circle = shapeFactory.getShape(5);
        circle.draw();
    }
}
