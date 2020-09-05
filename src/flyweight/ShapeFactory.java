package flyweight;

import java.util.HashMap;
import java.util.Map;

class ShapeFactory {

    Map<String, Shape> list = new HashMap<>();

    public Shape getShape(String name){
        Shape shape = null;
        if(list.containsKey(name)){
            System.out.println("Busca feita do armarzenamento [ "+ name +" ] ");
            shape = list.get(name);
        }else{
            switch (name){
                case Shape.CIRCLE:
                    System.out.println("Criando do armarzenamento de "+Shape.CIRCLE);
                    shape = new Circle();
                    this.list.put(Shape.CIRCLE, shape);
                    break;
                case Shape.RECTANGLE:
                    System.out.println("Criando do armarzenamento de "+Shape.RECTANGLE);
                    shape = new Rectangle();
                    this.list.put(Shape.RECTANGLE, shape);
                    break;
                case Shape.TRIANGLE:
                    System.out.println("Criando do armarzenamento de "+Shape.TRIANGLE);
                    shape = new Triangle();
                    this.list.put(Shape.TRIANGLE, shape);
                    break;
            }
        }
        return shape;
    }
}
