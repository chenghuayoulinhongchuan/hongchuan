package Jichujieshao;

public class Test04yunsuanfubiaodashi {
	public static void main(String[] args){
		int x = 10;
		int y = 3;
		y++;//y = y+1
		y--;//y = y-1
		boolean z = (y>4)?true:false;
		int f = (y>4)?1:100;
		System.out.println(f);
		System.out.println(z);
		System.out.println(!(y>3));
		System.out.println(x/y);
		System.out.println(x%y);
		System.out.println(y);
		System.out.println(x!=y);
	}
}
//�����������+��-��*��/��%��++��--
//��ֵ�������=��+=(�Ӹ�ֵ)��-=(����ֵ)��*=(�˸�ֵ)��/=(����ֵ)��%=(ģ��ֵ)
//��ϵ�������>=��<=��>��<��==��!=----�����true����false
//�߼��������&(��λ��)��|(��λ��)��&&(�߼���----������С)��||(�߼���----������С)��!��^
//λ�������<<��>>
//��Ŀ���������
//���ʽ��������Ͳ����������һ����������壬Ҳ���Ǳ��ʽ