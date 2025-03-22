//Menthod Overloading
class ops{
    public int add(int x,int y){
        return x+y;
    }
}
public class calculator2 {
    public static void main(String[] args) {
        ops obj=new ops();
        System.out.println("Addition is "+obj.add(3, 4));
    }
}
