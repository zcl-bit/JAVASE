package demo7;

/**
 * @author: zcl
 * @create: 2022/4/14 16:02
 */
public class Circle {
    private double radii;

    public void setRadii(double radii){
        if(radii>=0){
            this.radii=radii;
        }else{
            System.out.println("数据有误");
        }
    }
    public double getRadii(){
        return radii;
    }
    public void draw(){
        System.out.println("根据半径"+radii+"画了一个圆");
    }
}
