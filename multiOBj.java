class Student {
    int roll;
    int marks;
    String name;
}
public class multiOBj{
    public static void main(String[] args) {
        
        // creating 3 objects of students class
        Student s1=new Student();
        s1.roll=53;
        s1.marks=324;
        s1.name="abc";

        Student s2=new Student();
        s2.roll=56;
        s2.marks=67;
        s2.name="abc";

        Student s3=new Student();
        s3.roll=12;
        s3.marks=234;
        s3.name="abc";

        // Creating students array.
        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        // for(int i=0;i<students.length;i++){
        //     System.out.println(students[i].name+ " : "+students[i].marks);
        // }
//here type of object in the array is Student,because form students array we are getting student reference
        for(Student i:students){
            System.out.println(i.name+ " : "+i.marks); // i represents one particular student at a time
        }
    }
}