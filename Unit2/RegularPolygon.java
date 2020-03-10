
/**
 * Write a description of class RegularPolygon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RegularPolygon
{
    private int nSides;
    private double sideLength;
    public RegularPolygon(int nSides, double sideLength){
        this.nSides = nSides;
        this.sideLength = sideLength;
    }
    
    public int getNSides(){
        return nSides;
    }
    
    public double getSideLength(){
        return sideLength;
    }
    
    public double getPerimeter(){
        return nSides * sideLength;
    }
    
    public double getApothem(){
        return sideLength / (2 * Math.tan(Math.toRadians(180.0) / nSides));
    }
    
    
    public double getRadius(){
        return Math.sqrt(Math.pow(getApothem(), 2) + Math.pow(sideLength/2, 2));
    }
    
    public double getLongestBisector(){
        int odd = nSides % 2;
        double a = getApothem();
        double r = getRadius();
        double l = (r * (2 - odd)) + (a * odd);
        return l;
    }
    
    public double getShortestBisector(){
        int odd = nSides % 2;
        double a = getApothem();
        double r = getRadius();
        double s = (a * (2 - odd)) + (r * odd);
        return s;
    }

    public double getArea(){
        return getPerimeter() * getApothem() / 2.0;
    }
    
    public void changeArea(double pct){
        double newArea = getArea() * pct;
        sideLength = Math.sqrt((4 * newArea * Math.tan(Math.PI/nSides))/nSides);
        
    }
    
    public double fitsIn(RegularPolygon other){ 
        return this.getRadius() - other.getApothem();
    }
    
    public String toString(){
        return String.format("RegularPolygon(nSides=%d, sideLength=%f", nSides, sideLength);
    }
    
    public boolean equals(RegularPolygon other){
        return this.nSides == other.nSides && this.sideLength == other.sideLength;
    }
    public static void main(String[] argv){
        RegularPolygon p = new RegularPolygon(5, 1.0);
        System.out.println(p.getArea());
        System.out.println(p.getSideLength());
        System.out.println(p.getApothem());
        p.changeArea(2);
        System.out.println(p.getArea());
        System.out.println(p.getSideLength());
        System.out.println(p.getApothem());
        p.changeArea(0.5);
        System.out.println(p.getArea());
        System.out.println(p.getSideLength());
        System.out.println(p.getApothem());
        System.out.println(p.getLongestBisector());
        System.out.println(p.getShortestBisector());
        //RegularPolygon r = new RegularPolygon(5, p.getSideLength());
        //System.out.println(r.getArea());
        //System.out.println(r.getSideLength());
    }
}
