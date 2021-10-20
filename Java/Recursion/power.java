public class Recursion{
    public static void main(String[] args){
        Recursion object = new Recursion();
        var number=object.power(5,2);
        System.out.println(number);
        
    }
    public int power(int base,int exponent){
        if(base==0){
            return 0;
        }
        if(exponent==0){
            return 1;
        }
        return base*power(base,exponent-1);
    }
}
