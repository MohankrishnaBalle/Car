import java.util.Scanner;

public class Funny {  // we are encapsulate this class by making this these fields to private, ad these
    // fields can be accessible to outside classes, by using accessors and mutators

    private static String shopName;
    private String address;
    private String[] products;


    public Funny(String shopName, String address, String[] products) {
        this.shopName = shopName;
        this.address = address;
        this.products = products;

    }
    public String getShopName() {
       return this.shopName = shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public String getAddress() {
        return this.address = address;
    }
    public void setAddress(String address){
       this.address = address;
    }

   public String[] getProducts(){
        return this.products = products;
   }
   public void setProducts(String[] products) {
       this.products = products;
   }
}
class B {

    public static void main(String[] args) {
       Funny obj = new Funny("bmw", "sohdsbc", new String[]{"cdgcvg", "dbhcbh", "gsvdgc"});
       B obj1 = new B();

        System.out.println(obj.getProducts().length);

//        String[] item = new String[3];
//        item[0] = "sdbh";
//        item[1] = "sjhd";
//        item[2] = "seqs";



    }

    public void method(){

      //  int var = Integer.parseInt("String");  we are getting an exception when we are using this block, that's why
        // we have to use try keyword

        try {
            int var = Integer.parseInt("21");
            System.out.println("hello");
        }
        catch (NumberFormatException nfe){
            System.out.println("this is an exception");
        }
        finally {
            System.out.println("YOO bro");
        }
    }

}