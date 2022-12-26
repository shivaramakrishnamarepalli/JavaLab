public class MethodOverWrite{
    private String variable1;
    private String variable2;
    public MethodOverWrite(){}
    public MethodOverWrite(String variable1,String variable2)
    {
        this.variable1=variable1;
        this.variable2=variable2;
    }
    public String getVar1()
    {
        return this.variable1;
    }
    public String getVar2()
    {
        return this.variable2;
    }
    public String concat()
    {
        return this.variable1+this.variable2;
    }
    public boolean equals()
    {
        return this.variable1.equals(variable2);
    }
    
}