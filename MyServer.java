//Name - Abhishek Madankar , Roll No. 285180


import java.net.*;  
import java.io.*;  
class MyServer{  
public static void main(String args[])throws Exception{  
ServerSocket ss=new ServerSocket(3333);  
Socket s=ss.accept();  
DataInputStream din=new DataInputStream(s.getInputS
tream());  
DataOutputStream dout=new DataOutputStream(s.getO
utputStream());  

BufferedReader br=new BufferedReader(new InputStrea
mReader(System.in));  
  
String str=&quot;&quot;,str2=&quot;&quot;;  
System.out.println(“YOUr name - roll no.”); // eneter
name and roll no.
while(!str.equals(&quot;stop&quot;)){  
str=din.readUTF();  
System.out.println(&quot;client says: &quot;+str);  
str2=br.readLine();  
dout.writeUTF(str2);  
dout.flush();  
}  
din.close();  
s.close();  
ss.close();  
}}