package homework.Four;

import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/16 15:11
 * 我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。规则为：号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println("请输入身份证号码");
        Scanner sc = new Scanner(System.in);
        String personID = sc.next();
        System.out.println(check(personID));
    }
//    private static void isSym(String personID){
//        for (int i = 0; i < personID.length(); i++) {
//            char c = personID.charAt(i);
//            if (i>18){
//                System.out.println("身份证长度异常");
//                break;
//            }else if(i == 0 && c=='0'){
//                System.out.println("不能以数字0开头");
//                break;
//            }else if(i<=17 && !(c>='0'&& c<='9')){
//                System.out.println("前17位只能是数字");
//                break;
//            }else if(i==18 && !((c>='0'&& c<='9') || c=='X')){
//                System.out.println("最后一位不正确");
//                break;
//            }else{
//                System.out.println("身份证正确");
//                break;
//            }
//        }
//
//    }
    public static boolean check(String personID){
        if(personID == null){
            return false;
        }
        if(personID .startsWith("0")){
            return false;
        }
        if(personID.length()!=18){
            return false;
        }

        for (int i = 0; i < personID.length(); i++) {
            char c = personID.charAt(i);
            if(i == personID.length()-1){
                if(c<'0' || c>'9' && c !='X'){
                    return false;
                }
            }else{
                if(c<'0'||c>'9'){
                    return false;
                }
            }
        }
        return true;
    }
}
