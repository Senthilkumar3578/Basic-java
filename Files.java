package Demo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
       public static void main(String[] args) {
    // File creation
    	   //File  fl=new File("/home/datasirpi/Files");
			/*
			 * boolean b=fl.exists(); System.out.println(b);
			 * 
			 * if(b==false) fl.mkdir();                         
			 * 
			 * boolean bl=fl.exists(); System.out.println(bl);
			 */
    	   
    	   
    //file ulla ennoru file odd pandrathu
    	   
			/*
			 * boolean bl=fl.exists(); if(bl==false) { try { fl.createNewFile();
			 * System.out.println("file created"); } catch (IOException e) {
			 * 
			 * e.printStackTrace(); } }
			 */
    	   
   //file delete 
    	//   fl.delete();
    	   
   //file rename
	 /*
	 * File fls=new File("/home/datasirpi/Files/kumar.txt"); try {
	 * fls.createNewFile(); } catch (IOException e) { // TODO Auto-generated catch
	 * block e.printStackTrace(); }
	 * 
	 * File name=new File("/home/datasirpi/Files/senthil.txt"); fls.renameTo(name);
	 * 
	 * System.out.println("File name "+name.getName());
	 */
    
  //list all files in desktop
    	   
	/*
	 * File f=new File("/home/datasirpi/Desktop"); String s[]=f.list(); for (String
	 * string : s) { System.out.println(string); }
	 */
    	   
 //take the text file
	/*
	 * File f=new File("/home/datasirpi/Files/"); File[] fileArr=f.listFiles();
	 * for(File fs:fileArr) { if(fs.isFile()) { String s=fs.getName(); int lastDot
	 * =s.lastIndexOf("."); String ext=s.substring(lastDot+1);
	 * 
	 * if(ext.equals("txt")) {
	 * System.out.println("file type ="+ext+" file size = "+f.length()); }
	 * 
	 * }
	 * 
	 * }
	 */   
    	   
  //Wirte and read the file
    	   File fl=new File("/home/datasirpi/Files/Demo.txt");
    	   try {
			fl.createNewFile();
			FileWriter writer=new FileWriter(fl);
			writer.write("Iam senthil kumar");
			writer.flush();
			writer.close();
			
			FileReader fr=new FileReader(fl);
			int out=fr.read();
			while(out!=-1) {
				//System.out.print((char)out);
				 out=fr.read();
			}
//store array and read
			
			char[] ch=new char[(int) fl.length()];
			System.out.println(ch.length);
			fr.read(ch);
			for(char ch1:ch) {
				System.out.print(ch1);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   
    	   
    	       	   
    	     
    	   
    	   
    	   
    	   
    	   
	}
}
