package flyweight;

class Test {
    public static void main(String[] args) {
        Ilustration ilustration = new Ilustration();
        ShapeFactory shapeFactory = new ShapeFactory();

        ilustration.addShape(shapeFactory.getShape(Shape.CIRCLE));
        ilustration.addShape(shapeFactory.getShape(Shape.CIRCLE));
        ilustration.addShape(shapeFactory.getShape(Shape.TRIANGLE));
        ilustration.addShape(shapeFactory.getShape(Shape.RECTANGLE));
        ilustration.addShape(shapeFactory.getShape(Shape.TRIANGLE));
        ilustration.addShape(shapeFactory.getShape(Shape.CIRCLE));
        ilustration.addShape(shapeFactory.getShape(Shape.TRIANGLE));
        ilustration.addShape(shapeFactory.getShape(Shape.RECTANGLE));
        ilustration.addShape(shapeFactory.getShape(Shape.RECTANGLE));
        ilustration.addShape(shapeFactory.getShape(Shape.RECTANGLE));

        ilustration.toDraw();
    }
}
