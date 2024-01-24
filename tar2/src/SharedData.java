import java.util.ArrayList;
import java.util.List;

public class SharedData 
{
	private List<Integer> list;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	public SharedData(List<Integer> list, int b) {
		
		this.list = list;
		this.b = b;
	}

	public boolean[] getWinArray() 
	{
		return winArray;
	}

	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	public List<Integer> getArray() 
	{
		return list;
	}

	public int getB() 
	{
		return b;
	}

	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
