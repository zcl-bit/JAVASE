package homeWork.One;

/**
 * @author: zcl
 * @create: 2022/4/14 16:23
 */
public class Phone {
    //属性
    private String brand;
    private int price;
    private String color;
    //构造
    public Phone(){

    }
    public Phone(String brand, int price, String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public int getprice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    //行为
    public void call(){
        System.out.println("正在使用价格为"+price + "元"+color + "色的"+brand+"手机打电话");
    }
    public void sendMessage(){
        System.out.println("正在使用价格为"+price + "元"+color + "色的"+brand+"手机发短信");
    }
}
