public class StringBufferDemo{
    public static void main(String[] args){
        StringBuffer str = new StringBuffer("Hello!");
        str.append(4123);
        str.insert(0,7699);
        System.out.println(str);
    }
}