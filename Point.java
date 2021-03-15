public class Point <T>
{
	private T x;
    private T y;
    private T z;
    
    public Point(T a, T b, T c)
    {
        x = a;
        y = b;
        z = c;
    }
    public String toString()
    {
        return "(" + x + ", " + y + ", " + z + ") ";
    }
    public T getX()
    {
        return x;
    }
    public T getY()
    {
        return y;
    }
    public T getZ()
    {
        return z;
    }
}
