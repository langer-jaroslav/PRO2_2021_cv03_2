package cz.uhk.pro2.models.geometry;

public abstract class GeometryObject {
    int a,b;

    protected GeometryObject(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void draw(){
        System.out.println("drawing...");
    }
    public abstract float obsah();
}
