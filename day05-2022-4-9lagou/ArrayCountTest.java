/*
    ���ʹ������ʵ����������ÿ�����ֳ��ִ�����ͳ��
 */
 import java.util.Scanner;
 public class ArrayCountTest{
	 public static void main(String[] args){
		 //1����ʾ�û�����һ��������
		 System.out.println("������һ����������");
		 Scanner sc = new Scanner(System.in);
		 int num=sc.nextInt();
		 //2��׼��һ������Ϊ10��int���͵�����
		 int[] arr = new int[10];
		 //3������������е�ÿ�����ֲ�ͳ�Ƶ�һά������
		 int temp = num;
		 while(temp>0){
			 arr[temp%10]++;
			 temp/=10;
		 }
		 //4����ӡ���յ�ͳ�ƽ��
		 for(int i =0;i<arr.length;i++){
			 if(arr[i]>0){
				 System.out.println("����"+i+"������"+arr[i]+"�Σ�");
			 }
		 }
	 }
 }
		 