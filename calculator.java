class ops{
    public  int add(int a,int b){
        int add =a+b;
        return add;
    }
    public  int subtraction(int a,int b){
        int subtraction=a-b;
        return subtraction;
    }
    public  int multiplication(int a,int b){
        int multiplication=a*b;
        return multiplication;
    }
    public  int division(int a,int b){
        int division=a/b;   
        return division;
    }
}

public class calculator {
    public static void main(String[] args) {
        int a=5,b=5;
        ops obj=new ops(); //object creation to access all the methods created in ops class
        int add=obj.add(a,b);
        int subtraction=obj.subtraction(a,b);
        int multiplication=obj.multiplication(a,b);
        int division=obj.division(a,b);
        System.out.println("Addition is "+add);
        System.out.println("Subtraction is "+subtraction);
        System.out.println("Multiplication is "+multiplication);
        System.out.println("Division is "+division);
    }
}
