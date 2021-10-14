public class ShapeFactory {
    public Shape getShape(int a, int b){
        if(a == b){
            return new Square(b);
        }
        else if(a != b){
            return new Rectangle(a,b);
        }
        return null;
    }
    public Shape getShape(int a){
        return new Circle(a);
    }
}
