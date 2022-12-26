public class IntegerArray{
    public static void main(String[] args){
        int[] a= new int[10];
        int[] b= {1,2,3,4};
        c=new int[]{6,7,8};

        for(int i=0;i<10;i++)
        {
            a[i]=i+1;
        }
        int sum=0;
        System.out.println("Array a is: ");
        for(int v : a)
        {
            System.out.print(" v ");
            sum+=v;
        }
        System.out.println("sum = "+sum);
        double avg=sum/a.lenget();
        System.out.println("Average = "+avg);

    }
}
