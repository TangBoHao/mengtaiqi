package bean;

import java.util.Random;

public class CharacterUtils {

	//����1��lengthΪ������λ��
	  public static String getRandomString(int length){
	    //����һ���ַ�����A-Z��a-z��0-9����62λ��
	    String str="zxcvbnmlkjhgfdsaqwertyuiopQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
	    //��Random���������
	        Random random=new Random();  
	        StringBuffer sb=new StringBuffer();
	        //����Ϊ����ѭ������
	        for(int i=0; i<length; ++i){
	          //����0-61������
	          int number=random.nextInt(62);
	          //������������ͨ��length�γ��ص�sb��
	          sb.append(str.charAt(number));
	        }
	        //�����ص��ַ�ת�����ַ���
	        return sb.toString();
	  }

}
