import java.util.*;
public class ArrayArrayTriangleTest{
	public static void main(String[] args){
		//1、提示用户输入行数
		System.out.println("请输入要进行显示的行数");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//2、根据用户输入的行数来声明对应的数组
		int[][] arr = new int[num][];
		
		//3、针对二维数组中的每个元素进行初始化
		//使用for循环控制二维数组的行下标
		for(int i=0;i<num;i++){
			//针对二维数组的每一行进行内存申请
			arr[i]=new int[i+1];
			//使用内层for循环控制二维数组的列下标
			for(int j = 0 ;j<=i;j++){
				//当下标为0或者列标2与当前行的下标一致为1
				
				if(0==j||i==j){
					arr[i][j]=1;
				}else{
					//否则对应位置的元素就是上一行当前列的元素加上上一行前一列的元素
					arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
				}
			}
		}
		
		//4、打印数组
		for(int i=0;i<num;i++){
			for(int j =0;j<=i;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
		
					