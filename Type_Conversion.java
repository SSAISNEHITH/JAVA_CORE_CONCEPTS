public class Type_Conversion {
    static void main(String[] args) {
        //implicit conversion
        //byte->short->int->long->float->double
        System.out.println("implicit conversion");
        byte b=120;
        System.out.println("Byte ="+b);
        short s=b;
        System.out.println("Short ="+s);
        int i=b;
        System.out.println("int ="+i);
        long l=b;
        System.out.println("Long ="+l);
        float f=b;
        System.out.println("float ="+f);
        double d=b;
        System.out.println("double ="+d);
        //explicit conversion
        //double->float->long->int->short->byte
        System.out.println("explicit conversion");
        double d1=256.54d;
        System.out.println("double="+d1);
        float f1=(float)d1;
        System.out.println("float ="+f1);
        long l1=(long)d1;
        System.out.println("Long ="+l1);
        int i1=(int)d1;
        System.out.println("integer="+i1);
        short s1=(short)d1;
        System.out.println("short="+s1);
        byte b1=(byte)d1;
        System.out.println("byte="+b1);
    }
}
