package com.yuanzijian.cn.itcast.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

/*
 ���� �ͻ���������һ��һ�����졣
 
 
 1.���ʹ��BuffrerdReader��readline����һ��Ҫ����\r\n�Ű�����д����
 2.ʹ���ַ���һ��Ҫ����flush�������ݲŻ�д����
 
 */


//����Ŀͻ���
public class ChatClient {

	public static void main(String[] args) throws IOException {
		//����tcp�Ŀͻ��˷���
		Socket socket = new Socket(InetAddress.getLocalHost(),9090);
		//��ȡsocket�����������
		OutputStreamWriter socketOut =	new OutputStreamWriter(socket.getOutputStream());
		//��ȡsocket������������
		BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		//��ȡ���̵����������󣬶�ȡ����
		BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		//���ϵĶ�ȡ����¼������ݣ�Ȼ�������д��
		while((line = keyReader.readLine())!=null){
			socketOut.write(line+"\r\n");
			//ˢ��
			socketOut.flush();
			
			//��ȡ����˻��͵�����
			line = socketReader.readLine();
			System.out.println("����˻��͵������ǣ�"+line);
		}
		//�ر���Դ
		socket.close();
	}
	
	
}
