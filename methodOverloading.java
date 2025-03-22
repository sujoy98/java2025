class ops{
    public int add(int x,int y){
        return x+y;
    }
    public int add(int x,int y,int z){
        return x+y+z;
    }
}
public class methodOverloading {
    public static void main(String[] args) {
        ops obj=new ops(); //object creation
        // calling method with two values
        System.out.println("Calling metehod with passing two values "+obj.add(5, 5));
        
        // calling method with three values
        System.out.println("Calling metehod with passing two values "+obj.add(5, 5, 5));
    }
}
