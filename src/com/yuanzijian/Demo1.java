package com.yuanzijian;



/*
 
字节流

输入字节流：
---------| InputStream 所有输入字节流的基类。 抽象类
------------| FileInputStream 读取文件的输入字节流 
------------| BufferedInputStream 缓冲输入字节流流，其实该类内部只不过是维护了8kb的字节数组而已。 出现的目的主要是为了提高读取文件的效率。

输出字节流：
---------| OutputStream 所有输出字节流的基类。 抽象类
--------------| FileOutputStream 向文件输出数据的输出字节流。 
--------------| BufferedOutputStream 向文件输出数据的输出字节流。

字符流

输入字符流：
----------| Reader  所有输入字符流的基类。 抽象类
--------------| FileReader  读取文件字符的输入字符流 。 
--------------| BufferedReader 缓冲输入字符流， 该类出现的目的主要是为了提高读取文件的效率与拓展功能(readLine)。

输出字符流
---------| Writer 所有输出字符流的基类。  抽象类。
-------------| FileWriter 向文件输出数据的输出字符流。
-------------| BufferedWriter 缓冲输出字符流， 该类出现 的目的是为了提高写文件数据的效率与拓展功能。


转换流

输入字节流的转换流           InputStreamReader
	InputStream--------------------> Reader 

输出字节流的转换流          OutputStream 
	OutputStream --------------------> Writer

转换流的作用：
	1. 可以把字节流转换成字符流使用。
	2. FileReader与FileWriter都是固定是gbk码表进行读写数据的，而转换流可以指定码表进行读写文件的数据。

Properties(配置文件类)

体系：
 -------| Map
 ------------| HashTable
 ----------------| Properties 配置文件类、
 
 
 	store() 用于生成一个配置文件
 	load() 加载一个配置i文件

注意：
	1. 如果配置文件存在着中文，那么生成配置文件的时候要使用字符流，否则会出现乱码。
	2. 如果需要修改配置文件的内容，应该先加载原本配置文件，然后再生成一个配置文件。

 
 
 */
public class Demo1 {

}
