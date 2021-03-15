public class Square <T>
{
	private T square;
    
    public Square(T side)
    {
        square = side;
    }
    public T getSideSquare()
    {
    	return square;
    }
    public String toString()
    {
    	return square + " ";
    }
}
