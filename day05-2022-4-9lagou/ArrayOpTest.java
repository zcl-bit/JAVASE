/*
���ʵ��һά�����������ʹ��
*/
public class ArrayOpTest{
	public static void main(String[] args){
		/*
		����һ������Ϊ5Ԫ������Ϊint���͵�һά���飬��ӡ����������Ԫ��ֵ
		*/
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		/*	ʹ��Ԫ��11��22��33��44�ֱ��������ǰ�ĸ�Ԫ�ظ�ֵ���ٴδ�ӡ
		*/
		System.out.println("-----------------");
		//1����ֵ��ʽ
		/*
		arr[0]=11;
		arr[1]=22;
		arr[2]=33;
		arr[3]=44;
		*/
		//2��forѭ����ֵ
		for(int i=0;i<arr.length-1;i++){
			arr[i]=(i+1)*11;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		/*		��Ԫ��55���뵽�±�Ϊ0��λ�ã�ԭ��Ԫ������ƶ����ٴ�ӡ����Ԫ��ֵ
		*/
		System.out.println("-----------------");
		//1����ֵ��ʽ
		/*
		arr[0]=55;
		arr[1]=11;
		arr[2]=22;
		arr[3]=33;
		arr[4]=44;
		*/
		//2��forѭ����ֵ
		for(int i=1;i<arr.length;i++){
			arr[i]=i*11;
		}
		arr[0]=55;
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		/*		��Ԫ��55��������ɾ����ɾ����ʽΪ����Ԫ����ǰ�ƶ������λ����Ϊ0����ӡ
		*/
		System.out.println("-----------------");
		//1����ֵ��ʽ
		/*
		arr[0]=11;
		arr[1]=22;
		arr[2]=33;
		arr[3]=44;
		arr[4]=0;
		*/
		//2��forѭ����ֵ
		for(int i=0;i<arr.length-1;i++){
			arr[i]=(i+1)*11;
		}
		arr[4]=0;
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		/*		�����������Ƿ����Ԫ��22�����������޸�Ϊ220���ٴδ�ӡ����Ԫ��
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