package cz.uhk.pro2.models.geometry;

public class SquareGeometryObject extends GeometryObject {

    public SquareGeometryObject(int a, int b) {
        super(a, b);
    }

    @Override
    public float obsah() {
        return a*b;
    }
}
