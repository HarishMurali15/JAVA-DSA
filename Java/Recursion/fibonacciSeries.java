import java.util.*;
class Recursion{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println("Enter the number: "+n);
        for(int i=0;i<=n;i++){
        System.out.println(fibonacci(i)+" ");
    }
    }
 public static int fibonacci(int n){
        if(n==0){
return 0;
}
        if(n==1){
return 1;       
}
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
