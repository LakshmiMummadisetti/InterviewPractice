package Arrays;

public class jaggedArray {
    public static void main(String arg[])
    {
        int num[][]=new int[3][];// we know rows but dont know the columns
        num[0] = new int[4]; //first row has 4 columns
        num[1] =new int[5]; //second row has 5 columns
        num[2]=new int[2]; //third row has 2 columns

        for(int i=0;i<num.length;i++) // this gives number of rows
        {
            for(int j=0;j<num[i].length;j++) //this gives number of columns in each row
            {
                num[i][j]=(int)(Math.random()*10);
            }
        }
        for(int ran[]:num)
        {
            for(int m:ran)
            {
                System.out.print(m+" ");

            }
            System.out.println();
        }
    }
}
