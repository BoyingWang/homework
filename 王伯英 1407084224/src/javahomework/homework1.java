package javahomework;

import java.util.ArrayList;
public class homework1 {
	public static void main(String[] args) {
		ArrayList<sheep> sheeplist = new ArrayList();
		sheeplist.add(new sheep("ϲ����"));
		sheeplist.add(new sheep("������"));
		sheeplist.add(new sheep("������"));
		sheeplist.add(new sheep("������"));
		sheeplist.add(new sheep("������"));
		sheeplist.add(new sheep("������"));
		/*for (int i = sheeplist.size()-1;i>=3;i--) 
			sheeplist.remove(i);
		for(Object s:sheeplist)
		{System.out.println(((sheep)s).name);}*/
		/*for (int i = 0; i < sheeplist.size(); i++) 
		{
			if (i==3) 
			{	for(int j=i;j<sheeplist.size();j++)
				{sheeplist.remove(j);
				j--;}
				
			} 
			else System.out.println(((sheep) (sheeplist.get(i))).name);
		}*/
		/*for(int i=0;i<sheeplist.size();i++)
		{
			if(i==3)
			{sheeplist.remove(i);
			i--;}
		}
		for(Object s:sheeplist)
		{System.out.println(((sheep)s).name);}*/
	}
}
