/*
���ʵ������Ԫ��֮��Ŀ���
*/
public class ArrayCopyTest{
	public static void main(String[] args){
		/*
		����һ����ʼֵΪ11 22 33 44 55��һά���鲢��ӡ����Ԫ��
		*/
		int[] arr1={11,22,33,44,55};
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		System.out.println("-------------");
		/*		����һ������Ϊ3Ԫ������Ϊint���͵�һά���鲢��ӡ����Ԫ��
		*/
		int[] arr2=new int[3];
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		System.out.println("-------------");
		/*		ʵ�ֽ���һ�������м�3��Ԫ�ظ�ֵ���ڶ���������
		*/
		//1����ͨ��ֵ��ʽ
		/*
		arr2[0]=arr1[1];
		arr2[1]=arr1[2];
		arr2[2]=arr1[3];
		*/
		//2��Java����arraycopy
		System.arraycopy(arr1,1,arr2,0,3);
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
	}
}
