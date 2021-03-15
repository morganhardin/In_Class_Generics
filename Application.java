public class Application
{
	public static void main(String[] args) 
	{
		FirstList<Square> squareList = new FirstList<Square>();
		FirstList<Point> pointList = new FirstList<Point>();
		FirstList<String> stringList = new FirstList<String>();
		
		Square<Integer> side = new Square<Integer>(0);
		Square<Integer> side1 = new Square<Integer>(1);
		Square<Integer> side2 = new Square<Integer>(2);
		Square<Integer> side3 = new Square<Integer>(3);
		Square<Double> side4 = new Square<Double>(8.3);
		Square<Double> side5 = new Square<Double>(5.1);
		Square<Double> side6 = new Square<Double>(9.8);
		Square<Double> side7 = new Square<Double>(1.5);
		
		Point<Integer> point = new Point<Integer>(4,8,6);
		Point<Integer> point1 = new Point<Integer>(5,9,2);
		Point<Double> point2 = new Point<Double>(5.2,8.9,1.4);
		Point<Double> point3 = new Point<Double>(3.8,2.9,7.1);
		
		squareList.addTerm(side);
		squareList.addTerm(side1);
		squareList.addTerm(side2);
		squareList.addTerm(side3);
		squareList.addTerm(side4);
		squareList.addTerm(side5);
		squareList.addTerm(side6);
		squareList.addTerm(side7);
		
		pointList.addTerm(point);
		pointList.addTerm(point1);
		pointList.addTerm(point2);
		pointList.addTerm(point3);
		
		stringList.addTerm("yellow");
		stringList.addTerm("blue");
		stringList.addTerm("red");
		stringList.addTerm("purple");
		stringList.addTerm("black");
		stringList.addTerm("white");
		stringList.addTerm("orange");
		stringList.addTerm("brown");
		stringList.addTerm("teal");
		stringList.addTerm("pink");
		
		System.out.println(squareList.toString());
		System.out.println(pointList.toString());
		System.out.println(stringList.toString());
	}
}
