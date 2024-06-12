package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringSpacesInPlace {
    public static void main(String args[])
    {
        String str = "ServiceNow is hiring for the QA roles";

        // Find the indices of all spaces
        List<Integer> indicesOfSpaces = new ArrayList<>();
        for (int index = str.indexOf(' '); index >= 0; index = str.indexOf(' ', index + 1)) {
            indicesOfSpaces.add(index);
        }
        System.out.println("The indices of all spaces are: " + indicesOfSpaces);
        String removespaces = str.replaceAll(" ","");
        System.out.println(removespaces);
        StringBuffer sb = new StringBuffer(removespaces);
        String reversed = String.valueOf(sb.reverse());
        System.out.println(reversed);
        StringBuffer sb1 = new StringBuffer(reversed);
        for(int i :indicesOfSpaces) {
            sb1.insert(i," ");
        }
        System.out.println(sb1);


    }
}
