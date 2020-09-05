package flyweight;

import java.util.ArrayList;
import java.util.List;

class Ilustration {

    private List<Shape> shapes;

    public Ilustration() {
        this.shapes = new ArrayList<>();
    }

    public void addShape(Shape shape){
        this.shapes.add(shape);
    }

    public void toDraw(){
        this.shapes.forEach(item -> item.print());
    }
}
