/*
编程实现数组元素之间的拷贝
*/
public class ArrayCopyTest{
	public static void main(String[] args){
		/*
		声明一个初始值为11 22 33 44 55的一维数组并打印所有元素
		*/
		int[] arr1={11,22,33,44,55};
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		System.out.println("-------------");
		/*		声明一个长度为3元素类型为int类型的一维数组并打印所有元素
		*/
		int[] arr2=new int[3];
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		System.out.println("-------------");
		/*		实现将第一个数组中间3个元素赋值到第二个数组中
		*/
		//1、普通赋值方式
		/*
		arr2[0]=arr1[1];
		arr2[1]=arr1[2];
		arr2[2]=arr1[3];
		*/
		//2、Java函数arraycopy
		System.arraycopy(arr1,1,arr2,0,3);
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
	}
}
