package javahomework;
class runnable1 implements Runnable
{	public int ticket=10;
	public String name;
//	public runnable1(String name)
//	{this.name=name;}
	public void run()
	{
		for(int i=0;i<500;i++)
			if(ticket>0)
			{System.out.println(thread.currentThread().getName()+"��"+(ticket--));}
	}

	}
public class runnabke {

	public static void main(String[] args) {
		runnable1 mt=new runnable1();
		Thread t1 = new Thread(mt,"1�Ŵ�");  
		Thread t2 = new Thread(mt,"2�Ŵ�");  
		Thread t3 = new Thread(mt,"3�Ŵ�");  
		t1.start();
		t2.start();
		t3.start();

	}

}
