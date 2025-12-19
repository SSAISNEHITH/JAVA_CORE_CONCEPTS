public class stringmethod {
    static void main(String[] args) {
        String s = "Hello";
        String s1="hello";
        String s2="world";
        //String methods
        //charAt method
        System.out.println(s.charAt(3));
        System.out.println(s1.charAt(3));
        System.out.println(s2.charAt(3));
        //length method;
        System.out.println(s.length());
        System.out.println(s1.length());
        System.out.println(s2.length());
        //indexof
        System.out.println(s.indexOf("E"));
        System.out.println(s1.indexOf("ll"));
        System.out.println(s2.indexOf("wor"));
        //contrains
        System.out.println(s1.contains("ello"));
        System.out.println(s1.contains("ery"));
        //to lower case
        System.out.println(s.toLowerCase());
        //to upper case
        System.out.println(s1.toUpperCase());
        //to replace
        String str="i love programing";
        String stt1=(str.replace("programing","java"));
        System.out.println(str);
        System.out.println(stt1);
        //substring
        System.out.println(str.substring(5));
        System.out.println(str.substring(5,8));
        //string concatination
        System.out.println(s1+" "+s2);
        int x=20;
        System.out.println(s1+" "+x);

    }
}
