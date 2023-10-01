public class fun{
    public static void main(String a[])
    {
        System.out.println("Hello to my shelf");
        int val= 23;
        int arr[]=new int[5];
        String str=new String("Gone By Now");
        System.out.println(str);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(int)(Math.random()*10);
            System.out.println(arr);
        }

    }
}