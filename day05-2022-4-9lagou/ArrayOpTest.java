/*
编程实现一维数组的声明和使用
*/
public class ArrayOpTest{
	public static void main(String[] args){
		/*
		声明一个长度为5元素类型为int类型的一维数组，打印数组中所有元素值
		*/
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		/*	使用元素11、22、33、44分别对数组中前四个元素赋值后再次打印
		*/
		System.out.println("-----------------");
		//1、赋值方式
		/*
		arr[0]=11;
		arr[1]=22;
		arr[2]=33;
		arr[3]=44;
		*/
		//2、for循环赋值
		for(int i=0;i<arr.length-1;i++){
			arr[i]=(i+1)*11;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		/*		将元素55插入到下标为0的位置，原有元素向后移动，再打印所有元素值
		*/
		System.out.println("-----------------");
		//1、赋值方式
		/*
		arr[0]=55;
		arr[1]=11;
		arr[2]=22;
		arr[3]=33;
		arr[4]=44;
		*/
		//2、for循环赋值
		for(int i=1;i<arr.length;i++){
			arr[i]=i*11;
		}
		arr[0]=55;
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		/*		将元素55从数组中删除，删除方式为后续元素向前移动，最后位置置为0并打印
		*/
		System.out.println("-----------------");
		//1、赋值方式
		/*
		arr[0]=11;
		arr[1]=22;
		arr[2]=33;
		arr[3]=44;
		arr[4]=0;
		*/
		//2、for循环赋值
		for(int i=0;i<arr.length-1;i++){
			arr[i]=(i+1)*11;
		}
		arr[4]=0;
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		/*		查找数组中是否存在元素22，若存在则修改为220后再次打印所有元素
		*/
		System.out.println("-----------------");
		for(int i=0;i<arr.length;i++){
			if(arr[i]==22){
				arr[i]=220;
			}
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
}