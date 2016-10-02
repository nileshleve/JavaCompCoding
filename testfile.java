import java.util.*;
class testfile
{
    public static void call(Exception e)
    {
        System.out.println("Exception");
    }
    public static void call(NullPointerException e)
    {
        System.out.println("NullPointer");      //NullPointer is printed
    }
    public static void call(Object e)
    {
        System.out.println("Object");
    }
    public static void main(String[]a)   //this just works dont know why but it does
    {
        call(null);
    }

}