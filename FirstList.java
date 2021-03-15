import java.util.Arrays;

public class FirstList <T>
{
	private final int DEFAULT_SIZE=10;
    private int lastArrayPosition=0;
    private T arList[];
    
  	@SuppressWarnings("unchecked")
    public FirstList()
    {                          		
		arList=(T[]) new Object[DEFAULT_SIZE];
    } 

	@SuppressWarnings("unchecked")
	public FirstList(int length)
	{
        arList=(T[]) new Object[length];
    }
    public void addTerm(T item)
    {
        arList[lastArrayPosition] = item;
        lastArrayPosition++;
    }
    public void setArrayList(T arrayList[])
    {
    	this.arList = arrayList;
    }
    @Override
	public String toString() {
		return "FirstList [DEFAULT_SIZE=" + DEFAULT_SIZE + ", lastArrayPosition=" + lastArrayPosition + ", arList="
				+ Arrays.toString(arList) + "]";
	}
}
