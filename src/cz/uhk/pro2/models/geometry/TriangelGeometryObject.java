package cz.uhk.pro2.models.geometry;

public class TriangelGeometryObject extends GeometryObject {
    private int c;
    public TriangelGeometryObject(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public float obsah() {
        return a+b+c;
    }
}
