package src.main.java;

public class AreaCalculator {

    public double calculate(String shapeType, double dimension) {
        switch (shapeType) {
            case ShapeType.CIRCLE:
                return Math.PI * dimension * dimensions;
            case ShapeType.SQUARE:
                return dimension * dimensions;
            default:
                throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        }
    }
}
