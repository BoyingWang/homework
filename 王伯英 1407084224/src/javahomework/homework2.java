package javahomework;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class homework2 {

	public static void main(String[] args) {
		File manyfile=new File("D://testfoio");
		File file = null ;
		try {
		if(!manyfile.exists())
		manyfile.mkdir();
		for(int i=0;i<10;i++)
		{file=new File(manyfile.getAbsolutePath(),"helloworld"+i+".txt");
		if(!file.exists())
		file.createNewFile();}
	} catch (IOException e) {
		e.printStackTrace();
	}
String []filenames= manyfile.list();
for(int i=0;i<filenames.length;i++)
System.out.println(filenames[i]);
File file3=new File(manyfile,"helloworld3.txt");
file3.delete();
for(int i=0;i<=9;i++)
{
file =new File(manyfile,"helloworld"+i+".txt");
OutputStream os=null;
try {
	
	os=new FileOutputStream(file);
	String s="ÎÒÕæ"+i;
	try {
		os.write(s.getBytes());
	} catch (NumberFormatException | IOException e) {
		e.printStackTrace();
	}
} catch (FileNotFoundException e) {
	e.printStackTrace();
}finally
{
	try {
		os.close();
	} catch (IOException e) {
		e.printStackTrace();
	}}
}

	}
}
