 import java.util.*;
 import java.math.*;
 public class ArrayHomeWork{
	 public static void main(String[] args){
		 /* 
		 ����� ʵ��˫ɫ��齱��Ϸ�н���������ɣ��н������� 6 ���������� 1 �����������ɡ� ���к������Ҫ��������� 6 �� 1~33 ֮�䲻�ظ���������롣 �����������Ҫ��������� 1 �� 1~16 ֮���������롣 
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
		 System.out.print("��ɫ�����Ϊ��");
		 for(int i =0;i<arrRed.length;i++){
			 System.out.print(arrRed[i]+" ");
		 }
		 System.out.println("");
		 System.out.print("��ɫ�����Ϊ��"+arrBlue[0]);
		 
		 /*
		 ����� ʵ���������ݡ��Զ������鳤�ȣ��û�ָ���������ݹ��򣺵��Ѵ洢Ԫ�������ﵽ�������� 80%ʱ�����ݵ�ԭ������1.5 ���� ���磬ԭ������ 10��������� 8 ��Ԫ��ʱ������������ݣ������� 10 �� 15��
		 */
		 
		 
		 
		 
	 }
 }
 