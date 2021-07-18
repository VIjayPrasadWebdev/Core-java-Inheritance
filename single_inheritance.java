class vegetables
{
    String veg_name1, veg_name2, veg_name3;
    int total,total_veg, price;
    void process(int tv ,int pr)

    {
        total_veg =tv;
        price=pr;
        total = total_veg * price;

    }
    void display()
    {
        System.out.println("veg_name 1 is " + veg_name1);
        System.out.println("veg_name 2 is " + veg_name2);
        System.out.println("veg_name 3 is " + veg_name3);
        System.out.println("The total amount is " + total);
    }


}

class customer extends vegetables
{
    void details()
    {
        veg_name1="brinjal";
        veg_name2="carrot";
        veg_name3="tomato";
    }


}

public class single_inheritance {
    public static void main(String[] x) {

        customer c = new customer();
        c.process(3 , 50);
        c.details();
        c.display();

    }
}

