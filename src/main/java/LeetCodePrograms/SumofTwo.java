package LeetCodePrograms;

public class SumofTwo {
    public static void main(String args[])
    {
        int num[] = {1,2,3,4,5};
        int target =5;
        Sum obj = new Sum();
        obj.sumOfTwo(num,target);
//        for(int i=0;i<num.length;i++)
//        {
//            for(int j=i+1;j< num.length;j++)
//            {
//                if(num[i]==target-num[j])
//                {
//                    System.out.println(i + ","+ j);
//                }
//            }
        }
    }

class Sum {
    public void sumOfTwo(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == target - num[j]) {
                    System.out.println(i + "," + j);
                }
            }
        }


    }
}
