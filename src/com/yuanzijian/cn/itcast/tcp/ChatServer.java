package com.yuanzijian.cn.itcast.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 ����ķ����
 */
public class ChatServer {

	public static void main(String[] args) throws IOException {
		//����tcp�ķ����
		ServerSocket serverSocket = new ServerSocket(9090);
		//���ܿͻ��˵����ӣ�����һ��SOcket
		Socket socket = serverSocket.accept();
		//��ȡ��Socket������������
		BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		//��ȡ��Socket���������
		OutputStreamWriter socketOut =  new OutputStreamWriter(socket.getOutputStream());
		
		//��ȡ���̵�����������
		BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
		
		
		//��ȡ�ͻ��˵�����
		String line = null;
		while((line = socketReader.readLine())!=null){
			System.out.println("����˽��յ������ݣ�"+ line);
			
			System.out.println("��������͸��ͻ��˵����ݣ�");
			line = keyReader.readLine();
			socketOut.write(line+"\r\n");
			socketOut.flush();
		}
		
		//�ر���Դ
		serverSocket.close();
	}
	
}
