package Arrays;

public class EmptymultiDimenArray {
    public static void main(String args[])
    {
        int num[][]=new int[3][4];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}
