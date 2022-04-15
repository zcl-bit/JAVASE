package homeWork.Two;

/**
 * @author: zcl
 * @create: 2022/4/14 16:29
 */
public class GirlFriend {
    private String name;
    private double height;
    private double width;
    public GirlFriend(){

    }
    public GirlFriend(String name, double height, double width){
        this.name = name;
        this.height = height;
        this.width = width;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public void Wash(){
        System.out.println("女朋友帮我洗衣服");
    }
    public void cook(){
        System.out.println("女朋友给我做饭");
    }
    public void show(){
        System.out.println("我女朋友叫"+name+",身高"+height+",体重"+width+"斤");
    }

}
