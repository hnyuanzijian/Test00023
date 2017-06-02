package com.yuanzijian.cn.itcast.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//ģ��Tomcat������
public class TomcatDemo extends Thread {
	
	Socket socket;
	
	public TomcatDemo(Socket socket){
		this.socket = socket;
	}
	
	
	public void run() {
		try {
			//��ȡsocket�����������
			OutputStream outputStream = socket.getOutputStream();
			//������д���������
			outputStream.write("<html><head><title>aaa</title></head><body>��ð������</body></html>".getBytes());
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) throws IOException {
		//����tcp�ķ����
		ServerSocket serverSocket = new ServerSocket(9090);
		//���ϵĽ��ܿͻ��˵�����
		while(true){
			Socket socket = serverSocket.accept();
			new TomcatDemo(socket).start();
		}
	}
	
}
