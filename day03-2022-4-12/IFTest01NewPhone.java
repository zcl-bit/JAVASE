/**
 * @author: zcl
 * @create: 2022/4/12 9:07
 */
public class IFTest01NewPhone {
    public static void main(String[] args) {
        int phoneNumber = 7988;
        int oldPhone = phoneNumber-1500;
        double eighthPhone = phoneNumber-(phoneNumber*0.8);

        if(eighthPhone>oldPhone){
            System.out.println("使用以旧换新更省钱,花费为："+eighthPhone);
        }else{
            System.out.println("不使用以旧换新更省钱，花费为："+oldPhone);
        }
    }
}
