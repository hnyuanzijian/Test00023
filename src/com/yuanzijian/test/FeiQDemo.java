package com.yuanzijian.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

public class FeiQDemo {
	
	public static void main(String[] args) throws IOException {
		//��һ��������udp�ķ���
		DatagramSocket datagramSocket = new DatagramSocket();
		//�ڶ�����׼�����ݣ�Ȼ������ݷ�װ �����ݰ��У�
		String data = getData("������Ϻã�");
		DatagramPacket datagramPacket = new DatagramPacket(data.getBytes(), data.getBytes().length, InetAddress.getByName("192.168.15.255"), 2425);
		//�������� ����udp�ķ���������
		datagramSocket.send(datagramPacket);
		//�ر���Դ
		datagramSocket.close();
	}
	
	//��������װ��feiQ����ĸ�ʽ����
	public static String getData(String data){
		StringBuilder sb = new StringBuilder();
		sb.append("1.0:");
		sb.append(System.currentTimeMillis()+":");
		sb.append("�׷���:");
		sb.append("192.168.15.31:");
		sb.append("32:");
		sb.append(data);
		return sb.toString();
	}
	
	

}
