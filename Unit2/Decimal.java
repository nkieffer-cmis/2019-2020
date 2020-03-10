public class Decimal
{
    private int integer;
    private int decimal;
    public Decimal(int integer, int decimal){
        this.integer = integer;
        this.decimal = decimal;
    }
    
    public Decimal adda(Decimal other){
        System.out.println(this+ " " + other);
        int thisMag = getMag(this.decimal);
        int otherMag = getMag(other.decimal);
        int greaterMag = Math.max(thisMag, otherMag);
        int thisTemp = this.decimal;
        int otherTemp = other.decimal;
        System.out.println(thisTemp+" "+thisMag);
        System.out.println(otherTemp+" "+otherMag);
        thisTemp *= thisMag > otherMag ? 1 : pow(10, otherMag - thisMag);
        otherTemp *= otherMag > thisMag ? 1 : pow(10, thisMag - otherMag);
        int newDec = thisTemp + otherTemp;
        int newDecMag = getMag(newDec);
        
        System.out.println(thisTemp+" " + otherTemp+" "+thisMag+ " " + otherMag + " " + newDecMag);
        int newInt = this.integer + other.integer;
        if (newDecMag > greaterMag){
            newInt += getCarry(newDec);
            System.out.println(newDec);
           // newDec -= (int)Math.pow(10,newDecMag-1);//(newDec / (int)Math.pow(10, greaterMag)) - getCarry(newDec);
            System.out.println(newDec);
        }
        return new Decimal(newInt, newDec);
    }
    public String toString(){
        int value = getCarry(decimal) == 1 ? decimal - pow(10, getMag(decimal)): decimal;
        String zero = String.format("%s%d", getCarry(decimal) == 1 ? "0" : "", value);
        return String.format("%d.%s", integer, zero);
    }
    
    public double toDouble(){
        return (double)integer + ((double)decimal / pow(10,getMag(decimal)));
    }
    
    
    public static void main(String[] argv){
        Decimal d = new Decimal(4, 93);
        Decimal e = new Decimal(2, 17);
        System.out.println(d.adda(e));
    }
    
    public static int getMag(int i){
        int mag = -1;
        while( i > 0 ){
            i /= 10;
            mag++;
        }
        return mag;
        
    }
    
    public static int getCarry(int i){
        return i / pow(10, getMag(i));
    }
    
    public static int pow(int n, int e){
        if ( e == 0){
            return 1;
        }else{
            return n * pow(n, e - 1);
        }
    }
}
