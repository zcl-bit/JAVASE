 import java.util.*;
 import java.math.*;
 public class ArrayHomeWork{
	 public static void main(String[] args){
		 /* 
		 编程题 实现双色球抽奖游戏中奖号码的生成，中奖号码由 6 个红球号码和 1 个蓝球号码组成。 其中红球号码要求随机生成 6 个 1~33 之间不重复的随机号码。 其中蓝球号码要求随机生成 1 个 1~16 之间的随机号码。 
		 */
		 int[] arrRed = new int[6];
		 int[] arrBlue = new int[1];
		 Set set = new HashSet();
		 for(int i = 0;i<arrRed.length;i++){
			 arrRed[i]=(int)(Math.random()*33)+1;
			 for(int j=1;j<arrRed.length;j++){
				 if(arrRed[i]==arrRed[j]){
					 arrRed[i]=(int)(Math.random()*33)+1;
				 }else{
					 break;
			 }
			 }
		 }
		 arrBlue[0]=(int)(Math.random()*16)+1;
		 System.out.print("红色球号码为：");
		 for(int i =0;i<arrRed.length;i++){
			 System.out.print(arrRed[i]+" ");
		 }
		 System.out.println("");
		 System.out.print("蓝色球号码为："+arrBlue[0]);
		 
		 /*
		 编程题 实现数组扩容。自定义数组长度（用户指定），扩容规则：当已存储元素数量达到总容量的 80%时，扩容到原容量的1.5 倍。 例如，原容量是 10，当输入第 8 个元素时，数组进行扩容，容量从 10 变 15。
		 */
		 
		 
		 
		 
	 }
 }
 