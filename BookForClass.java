package Assignment01;

public class BookForClass 
{
	private int numPages;
	private String title;

	public BookForClass(int nPages, String aTitle){
		this.numPages= nPages;
		this.title = aTitle;
	}
	
	public double pagesNeededPerDayToRead(int maxDays){
		double pagesNeededPerDay =  numPages/(double)maxDays;
		return pagesNeededPerDay;
		
	}
	public int daysNeededToRead(int pagesReadPerDay){
		int daysNeededToRead = numPages/pagesReadPerDay ;
		if (numPages%pagesReadPerDay != 0){
			return daysNeededToRead+1;
				}
		else{  return daysNeededToRead;		
		}

	}
	public int needToRead(int fromPage, int toPage, int daysTodeadline){
		toPage = (toPage - fromPage +1);
		double n = (double)toPage/daysTodeadline;
		int needToRead = (int)Math.ceil(n);
		return needToRead;
		}
	}	





	

