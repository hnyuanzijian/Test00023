package com.yuanzijian.cn.itcast.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

//Ⱥ�ķ��Ͷ�
public class ChatSender extends Thread {
	
	@Override
	public void run() {
		try {
			//����udp�ķ���
			DatagramSocket socket = new DatagramSocket();
			//׼�����ݣ������ݷ�װ�����ݰ��з���
			BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			DatagramPacket packet  = null;
			while((line = keyReader.readLine())!=null){
				//�����ݷ�װ ���������ݰ��У�Ȼ�������ݡ�
				packet = new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("192.168.15.255"), 9090);
				//�����ݷ��ͳ�ȥ
				socket.send(packet);
			}
			//�ر� ��Դ
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
