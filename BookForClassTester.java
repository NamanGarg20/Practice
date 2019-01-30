package Assignment01;

public class BookForClassTester{
	public static void main(String args[]){
		BookForClass book = new BookForClass(927, "Naman");

		double pagesNeededPerDay= book.pagesNeededPerDayToRead(90);
		int daysNeededToRead=book.daysNeededToRead(10);
		int needToRead = book.needToRead(3,456,45);
		System.out.println(pagesNeededPerDay);
		System.out.println(daysNeededToRead);
		System.out.println(needToRead);




	}
}