package com.yuanzijian.cn.itcast.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
��java������ͨѶҵ����ΪSocket(����)ͨѶ��Ҫ��ͨѶ ����̨��������Ҫ��װSocket��

��ͬ��Э����в�ͬ �Ĳ�����Socket��

UDPͨѶЭ����ص㣺
	1. �����ݼ���װΪ���ݰ������������ӡ�
	2. ÿ�����ݰ���С������64K��
	3.��Ϊ�����ӣ����Բ��ɿ�
	4. ��Ϊ����Ҫ�������ӣ������ٶȿ�
	5.udp ͨѶ�ǲ��ַ������ͻ��˵ģ�ֻ�ַ��Ͷ�����նˡ�
	
	
	���磺 ��ܵĶԽ���, ��Q���졢 ��Ϸ...

udpЭ���µ�Socket:
	
	DatagramSocket(udp��������)
	DatagramPacket(���ݰ���)
		DatagramPacket(buf, length, address, port)
		buf: ���͵���������
		length : �����������ݵĴ�С��
		address : ���͵�Ŀ��IP��ַ����
		port : �˿ںš�

���Ͷ˵�ʹ�ò��裺
	1. ����udp�ķ���
	2. ׼�����ݣ������ݷ�װ�����ݰ��з��͡� ���Ͷ˵����ݰ�Ҫ����ip��ַ��˿ںš�
	3. ����udp�ķ��񣬷������ݡ�
	4. �ر���Դ��


*/


//���Ͷ�
public class Demo1Sender {
	
	public static void main(String[] args) throws IOException {
		//����udp�ķ���
		DatagramSocket datagramSocket = new DatagramSocket();
		//׼�����ݣ������ݷ�װ�����ݰ��С�
		String data = "������ҵ�һ��udp������..";
		//������һ�����ݰ�
		DatagramPacket packet = new DatagramPacket(data.getBytes(), data.getBytes().length,InetAddress.getLocalHost() , 9090);
		//����udp�ķ��������ݰ�
		datagramSocket.send(packet);
		//�ر���Դ ---ʵ���Ͼ����ͷ�ռ�õĶ˿ں�
		datagramSocket.close();
		
	}

}
