package com.yuanzijian.cn.itcast.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 �����̣� ��������Ҫ���ڽ����������������ֻ���ƽ��..��֮������ݴ������⡣
 
������: ����Ҫ����htmlҳ��Ϳ��Դﵽ����֮��Ĵ��䡣 ���磺 feiQ , QQ , ΢��....

��ҳ��̣� ����Ҫ����htmlҳ��Ļ����Ͻ������ݵĽ����ġ� ���磺 �䰮���� oa(�칫�Զ���)�� �߿��ı���ϵͳ...

��������磺 �ֲ��ڲ�ͬ���� �ļ����ͨ���ⲿ�豸���������ﵽ����Ϣ��ͨ����Դ�����Ч���ͳ���Ϊһ����������硣

����ͨѶ����Ҫ�أ�
	1. IP
	2. �˿ںš�
	3. Э��.
	
192.168.10.1
IP��ַ��	IP��ַ�ı��ʾ���һ����32λ�Ķ�����������ɵ����ݡ� ��������Ϊ�˷������Ǽ���IP��ַ���Ͱ�IP��ַ�г���4�ݣ�ÿ��8bit.   2^8 = 0~255
      00000000-00000000-00000000-00000000

IP��ַ = �����+ �����š�

IP��ַ�ķ��ࣺ
	A���ַ = һ������� + ����������     2^24   ������λ
	B���ַ =  ���������+ ����������   2^16 ��ҵ��λ��ѧУ������..��
	C���ַ= ���������+ һ��������  2^8    ˽��ʹ��..

InetAddress(IP��)

���õķ�����
	getLocalHost();  ��ȡ������IP��ַ
	getByName("IP����������") ����һ��IP��ַ���ַ�����ʽ������һ������������һ��IP��ַ���� (���ڻ�ȡ���˵�IP��ַ����)

	getHostAddress()  ����һ��IP��ַ���ַ�����ʾ��ʽ��
	getHostName()  ���ؼ��������������
	
	
�˿ں���û���������ġ�
	�˿ںŵķ�Χ�� 0~65535
		��0��1023��ϵͳ���ܰ���һЩ���� 
		1024~65535  ���ǿ���ʹ��....

����ͨѶ��Э�飺
	udpͨѶЭ��
	
	tcpͨѶЭ�顣

 */
public class Demo1 {
	
	public static void main(String[] args) throws UnknownHostException {
		//getLocalHost ��ȡ������IP��ַ����
		/*InetAddress address = InetAddress.getLocalHost();
		System.out.println("IP��ַ��"+address.getHostAddress());
		System.out.println("��������"+address.getHostName());*/
		
		//��ȡ���˻�����IP��ַ����
		
		
		//���Ը���һ��IP��ַ���ַ�����ʽ������һ������������һ��IP��ַ����
		InetAddress address = InetAddress.getByName("Jolly-pc140116");
		System.out.println("IP��ַ��"+address.getHostAddress());
		System.out.println("��������"+address.getHostName());

		
		
		InetAddress[]  arr = InetAddress.getAllByName("www.baidu.com");//����
		
		
	}

}
