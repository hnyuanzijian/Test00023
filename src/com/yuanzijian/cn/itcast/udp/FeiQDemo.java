package com.yuanzijian.cn.itcast.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 ÿ������������Լ���������ض���ʽ����,������յ������ݲ�����ָ���ĸ�ʽ����ô�ͻᱻ�����������ݶ�����(����..)

 ��Q���յ����ݸ�ʽ��
 version:time :sender : ip: flag:content ;
 �汾��          ʱ��         ������   :IP�� ���͵ı�ʶ��(32): ����������;

 ��udpЭ���У���һ��IP��ַ����Ϊ�㲥��ַ���㲥��ַ����������Ϊ255��ַ��

 ���㲥IP��ַ������Ϣ��ʱ����ͬһ������εĻ��������Խ��� ����Ϣ��
 192.168.15.255

 */
//ʹ��udpЭ�����Q������Ϣ��
public class FeiQDemo {

	public static void main(String[] args) throws IOException {
		// ����udp�ķ���
		DatagramSocket socket = new DatagramSocket();
		// ׼�����ݣ������ݷ�װ�����ݰ���
		String data = getData("feiQ��ã�");
		DatagramPacket packet = new DatagramPacket(data.getBytes(),
				data.getBytes().length,
				InetAddress.getByName("192.168.15.255"), 2425);
		// ��������
		socket.send(packet);
		// �ر���Դ
		socket.close();

	}

	// ������ƴ�ӳ�ָ����ʽ������
	public static String getData(String content) {
		StringBuilder sb = new StringBuilder();
		sb.append("1.0:");
		sb.append(System.currentTimeMillis() + ":");
		sb.append("ϰ���:");
		sb.append("192.168.10.1:");
		sb.append("32:");
		sb.append(content);

		return sb.toString();
	}

}
