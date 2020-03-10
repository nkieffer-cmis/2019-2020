public class SquareTester
{
     
    public static void main(String[] argv){
        Square squareA = new Square(1, "red");
        Square squareB = new Square(1, "blue");
        System.out.println(squareA);
        squareA.setColor("blue");
        System.out.println(squareA);
        squareA.setLocation(3, 7);
        System.out.println(squareA);
        squareA.setSideLength(23);
        squareB.setSideLength(2);
        System.out.println(squareA);
        System.out.format("%f %s %d\n",
            squareA.getSideLength(),
            squareA.getColor(),
            squareA.getLocation()[0]);
        System.out.println(squareA.equals(squareB));
        boolean z = Square.isSquare(2, 3);
        boolean y = Square.isSquare(3.2, 3.2);
        System.out.println(z+ " " + y);
        
        Square squareC = squareA.add(squareB);
        
        System.out.println(squareA);
        System.out.println(squareB);
        System.out.println(squareC);
        
        
    }
}
