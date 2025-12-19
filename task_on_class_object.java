public class task_on_class_object {
        static class redmi{
        int price=10000;
        float display_size=6.7f;
        String color="gray";
        String generation="5G";
        }
        static class oppo{
        int price=15000;
        float display_size=7.2f;
        String color="blacklight";
        String generation="4G";
        }
        static class samsung{
        int price=18000;
        float display_size=7.1f;
        String color="blue";
        String generation="5G";
        }
        static void main(String[] args) {
        redmi ph =new redmi();
        System.out.println(ph.price);
        System.out.println(ph.display_size);
        oppo ph2=new oppo();
        System.out.println(ph2.color);
        System.out.println(ph2.display_size);
        samsung ph3=new samsung();
        System.out.println(ph3.color);
        System.out.println(ph3.price);
    }
}
