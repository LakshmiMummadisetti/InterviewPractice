package Arrays;

public class multiDimenArrayUsingforeach {
    public static void main(String args[])
    {
        int num[][]=new int[3][4];
        for(int i =0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                num[i][j]=(int)(Math.random()*10);
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        for(int ran[]:num) // ran should not work here bcz it is a multidimentional array. have to use ran[]
        {
            for(int m:ran)
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
