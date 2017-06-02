package com.yuanzijian.cn.itcast.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

//Ⱥ�Ľ��ն�
public class ChatReceive extends Thread {
	
	@Override
	public void run() {
		try {
			//����udp�ķ���,Ҫ����һ���˿�
			DatagramSocket socket = new DatagramSocket(9090);
			//׼���յ����ݰ��洢����
			byte[] buf = new byte[1024];
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			boolean flag = true;
			while(flag){
				socket.receive(packet);
				// packet.getAddress() ��ȡ�Է����� ����IP��ַ����
				System.out.println(packet.getAddress().getHostAddress()+"˵:"+new String(buf,0,packet.getLength()));
			}
			//�ر���Դ
			socket.close();
		
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
