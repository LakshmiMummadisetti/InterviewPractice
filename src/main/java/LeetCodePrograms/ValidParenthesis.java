package LeetCodePrograms;

import static io.opentelemetry.api.trace.TraceId.isValid;

public class ValidParenthesis {

        public static void main(String[] args) {
            String s = "{[()]}";
            int mid = s.length()/2;
 First obj = new First();
 System.out.println(obj.sum(s,mid));

        }
}

class First
{
    public boolean sum(String s, int mid)
    {
        for(int i= 0, j =s.length()-1;i<mid; i++, j--)
        {
            System.out.println(s.charAt(i) + ":" + s.charAt(j));

            if(Character.compare(s.charAt(i),s.charAt(j))==0)
            {

                return false;
            }

        }
        return true;
    }
}
