public class Add extends MethodOverWrite{
    private String variable3;
    public Add(){}
    public Add(String variable1,String variable2,String variable3)
    {
        super(variable1,variable2);
        this.variable3=variable3;
    }
    public String concat(){
        String var1 = getVar1();
        String var2 = getVar2();
        return var1+var2+this.variable3;
    }
}