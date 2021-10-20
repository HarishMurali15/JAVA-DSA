public class Recursion{
    public static void main(String[] args){
        Recursion object=new Recursion();
        var number=object.fibonacci(6);
        System.out.println(number);
    }
    public int fibonacci(int n){
        if(n<0){
            return -1;
        }
        if(n==0||n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
