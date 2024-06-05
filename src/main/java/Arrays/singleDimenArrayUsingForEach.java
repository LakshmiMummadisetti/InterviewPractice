package Arrays;

public class singleDimenArrayUsingForEach {
    public static void main(String args[])
    {
        int num[]= new int[4];
        for(int i=0;i<4;i++)
        {
            num[i]=(int)(Math.random()*10);
//            System.out.print(num[i]+" ");
        }
        for(int ran : num)//for single dimen array, should not specify ran[]. other wise it will consider as multidimensional array
        {
            System.out.print(ran+" ");
        }
    }
}
