package sarvagyacode;

class Cylinder{
    private float radius;
    private float height;

    public Cylinder(float radius , float height){
        this.radius = radius;
        this.height = height;
    }
    public void setRadius(float r){
        this.radius = r;
    }
    public float getRadius(){
        return radius;
    }
    public void setHeight(float h){
        this.height = h;
    }
    public float getHeight(){
        return height;
    }
    public double Vol(){
        double vol = Math.PI*radius*radius  *height   ;
        return vol ;
    }
   
}

class CWH_PS_Constructor_AccessModifier {
    public static void main(String[] args) {
        
        // Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(12,9 );
        // c1.setHeight(45);
        // c1.setRadius(7.9f);
        // System.out.println(c1.getHeight());
        // System.out.println(c1.getRadius());
        // 
       // System.out.println(c1.Vol());
        System.out.println(c2.getHeight());
        System.out.println(c2.getRadius());

    }
}
