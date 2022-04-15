package homeWork.Four;

/**
 * @author: zcl
 * @create: 2022/4/14 16:45
 */
public class Dog {
    private String color;
    private String breed;

    public Dog() {
    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取
     * @return breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * 设置
     * @param breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void eat() {
        System.out.println(color+"的"+breed+"狗正在啃骨头");
    }
    public void lookHome() {
        System.out.println(color+"的"+breed+"狗正在看家");
    }
}
