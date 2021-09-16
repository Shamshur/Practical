package practice;

public class Integer {

	public static void main(String[] args) {
		int speedoflight;
		long days;
		long seconds;
		long distance;
//		approximate speed of light in miles per second 
		speedoflight =186000;
        days=1000;
        seconds=days * 24 * 60* 60; 
        distance = speedoflight*seconds; 
        System.out.print( " In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distance + " miles ");
        System.out.println(days);

	}

}
