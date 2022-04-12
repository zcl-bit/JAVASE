import java.util.Random;

/**
 * @author: zcl
 * @create: 2022/4/12 11:02
 */
/*
创建一个长度为6的整数数组。请编写代码，随机生成六个0（包含）-100（不包含）之间的整数存放到数组中，然后计算出数组中所有元素的和并打印

 */
public class ArrayRandom {
    public static void main(String[] args) {
        //1、创建一个长度为6的整数数组
        int[] arr = new int[6];
        //2、for循环随机生成0-100的整数放入数组中
        //3、创建随机数类对象
        Random r = new Random();
        //4、定义和变量
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]= r.nextInt(100);
            count+=arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println("数组和为："+count);
    }
}
