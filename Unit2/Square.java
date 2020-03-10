public class Square
{
    private double sideLength;
    private String color;
    private int x;
    private int y;
    
    public Square(){
        
    }
    
    public Square(int sideLength, String color){
         sideLength = sideLength;
        this.color = color;
    }
    
    public Square(String color){
        this.color = color;
    }
    
    public Square(double sideLength){
        this.sideLength = sideLength;
    }
    
 
    public double getSideLength(){
        return sideLength;
    }
    
    public void setSideLength(double newSideLength){
        sideLength = newSideLength;
    }
    
    public double getArea(){
        return Math.pow(sideLength, 2);
    }
    
    public void setArea(double area){
        sideLength = Math.sqrt(area);
    }
    public String getColor(){
        return color;
    }
    
    public void setColor(String newColor){
        color = newColor;
    }
    
    public int[] getLocation(){
        return new int[]{x, y};
    }
    
    public void setLocation(int newX, int newY){
        x = newX;
        y = newY;
    }
    
    public Square add(Square other){
        double totalArea = this.getArea() + other.getArea();
        Square result = new Square(Math.sqrt(totalArea));
        return result;
    }
    
    public String toString(){
        return String.format("Side Length: %f\nColor: %s\nx, y: %d, %d, %f",
                              sideLength, color, x, y, this.getArea());
    }
    
    public static boolean isSquare(double w, double h){
        return w == h;
    }
    
}
