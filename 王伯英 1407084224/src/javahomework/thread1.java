package javahomework;
class thread extends Thread
{	public int ticket=10;
	public String name;
	public thread(String name)
	{this.name=name;}
	public void run()
	{
		for(int i=0;i<500;i++)
			if(ticket>0)
			{System.out.println(this.name+"��"+(ticket--));}
	}
	}
public class thread1  {

	public static void main(String[] args) {
	thread t1=new thread("1�Ŵ�");
	thread t2=new thread("2�Ŵ�");
	thread t3=new thread("3�Ŵ�");
	t1.start();
	t2.start();
	t3.start();

	}

}
