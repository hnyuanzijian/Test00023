package com.yuanzijian.cn.itcast.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class SafeReceive {
	
	public static void main(String[] args) throws IOException, Exception {
		//����udp�ķ���
		DatagramSocket socket = new DatagramSocket(9090);
		
		//�����յ����ݰ��洢����
		byte[] buf = new byte[1024];
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		
		//���Ͻ������ݰ�
		while(true){
			socket.receive(packet);
			System.out.println(new String(buf,0,packet.getLength()));
			Thread.sleep(10);
		}
		
		
		
	}
	
	

}
