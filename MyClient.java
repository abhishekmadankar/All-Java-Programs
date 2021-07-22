//Name - Abhishek Madankar , Roll No. 285180


import java.net.*;  
import java.io.*;  
class MyClient{  
public static void main(String args[])throws Exception{  
Socket s=new Socket(&quot;192.168.1.101&quot;,3333);  // enter
localhost
DataInputStream din=new DataInputStream(s.getInputS
tream());  

DataOutputStream dout=new DataOutputStream(s.getO
utputStream());  
BufferedReader br=new BufferedReader(new InputStrea
mReader(System.in));  
  
String str=&quot;&quot;,str2=&quot;&quot;;  
while(!str.equals(&quot;stop&quot;)){  
str=br.readLine();  
dout.writeUTF(str);  
dout.flush();  
str2=din.readUTF();  
System.out.println(&quot;Server says: &quot;+str2);  
}  
  
dout.close();  
s.close();  
}}