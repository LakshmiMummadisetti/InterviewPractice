package Arrays;

public class ArrayOfObjects {
    public static void main(String args[])
    {
        //object 1 for student class
        Student s1= new Student();
        s1.empno= 10;
        s1.name="Lakshmi";
        s1.lastname ="Kumari";
        //object 2 for student class
        Student s2= new Student();
        s2.empno= 30;
        s2.name="sai";
        s2.lastname ="prathap";
        //object 3 for student class
        Student s3= new Student();
        s3.empno= 40;
        s3.name="chervik";
        s3.lastname ="kathi";
        //creating an object array and assigning objects to it.
        Student stuArray[] = new Student[3];
        stuArray[0]=s1;
        stuArray[1]=s2;
        stuArray[2]=s3;
        //normal for loop
        for(int i=0;i<stuArray.length;i++)
        {
            System.out.println(stuArray[i].name +":"+stuArray[i].empno);
        }
        //using for each loop
        for(Student stud: stuArray)
        {
            System.out.println(stud.name +":"+stud.lastname+"-"+stud.empno);
        }
    }
}

class Student{
    int empno;
    String name;
    String lastname;
}
