package abc.geometry;

import com.globalpayex.geometry.entities.Rectangle;

public class ShapeStatistics {

    public static String calculate(Shape shape){
        double area = shape.area();
        double perimeter = shape.perimeter();
        return String.format(
                "***\nArea is %s\nPerimeter is %s",
                area,
                perimeter
        );
    }
}
