package ServiceNow;

public class FebinocciSeries {
    public static void main(String args[])
    {
        int first =0;
        int second =1;
        int third =0;
        int num =5;
        for(int i =0;i<num;i++)
        {

            third=first+second; //2
            first=second;//1
            second=third;  //1

            System.out.println(third);
        }
    }
}
