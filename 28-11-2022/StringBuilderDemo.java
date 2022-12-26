public class StringBuilderDemo{
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("Hello!");
        str.insert(5,'.');
        System.out.println(str);
        str.delete(4,7);
        System.out.println(str);
    }
}