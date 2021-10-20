public class Recursion{
    public static void main(String[] args){
        Recursion object=new Recursion();
        var number=object.factorial(10);
        System.out.println(number);
    }
    public int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        if(n<0){
            return -1;
        }
        return n*factorial(n-1);
    }
}
