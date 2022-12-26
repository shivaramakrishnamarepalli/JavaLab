public class Mystring{
    public static void main(String[] args){
        String s1="Implementing java string methods";
        String s2="Shiva";
        System.out.println("charAt(5)="+s1.charAt(5));
        System.out.println("Adding string at end->"+s1.concat(" added at end"));
        System.out.println("endsWith(end):"+s1.endsWith("end"));
        System.out.println("equals(string):"+s1.equals("String"));
        System.out.println("equalsIgnoreCase(end):"+s1.equalsIgnoreCase(s2));
        System.out.println("hashcode():"+s1.hashCode());
        System.out.println("isEmpty():"+s1.isEmpty());
        System.out.println("indexOf(v):"+s2.indexOf('v'));
        System.out.println("indexOf(in,4):"+s1.indexOf("in",4));
        System.out.println("length():"+s1.length());
        System.out.println("startsWith(Imp):"+s1.startsWith("Imp"));
        System.out.println("substring(12):"+s1.substring(12));
        System.out.println("lastIndexOf(v):"+s1.lastIndexOf('v'));
        System.out.println("lastIndexOf(v,10):"+s1.lastIndexOf('v',10));
        System.out.println("lastIndexOf(in):"+s1.lastIndexOf("in"));
        System.out.println("lastIndexOf(in,16):"+s1.lastIndexOf("in ",16));
    }
}