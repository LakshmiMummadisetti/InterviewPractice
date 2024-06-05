public class stringBuffer {
    public static void main(String args[])
    {
        String name="Lakshmi";
        StringBuffer sb = new StringBuffer(name);

        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        sb.append(" Kumari");
        System.out.println(sb);
        sb.insert(7," Sai");
        System.out.println(sb);
        char ch = sb.charAt(5);
        System.out.println(ch);
        sb.deleteCharAt(8);
        System.out.println(sb);
        sb.delete(8,10);
        System.out.println(sb);
    }
}
