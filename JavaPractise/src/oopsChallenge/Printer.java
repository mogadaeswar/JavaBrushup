package oopsChallenge;

public class Printer {
	
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	public Printer(int tonerLevel, boolean duplex) {
		this.tonerLevel = (tonerLevel>=0 && tonerLevel<=100)?tonerLevel:-1;
		this.pagesPrinted = 0;
		this.duplex = duplex;
	}
	
	public int addToner(int tonerAmount) {
		int actualTonerLevel=tonerLevel+tonerAmount;
		if(actualTonerLevel<0 && actualTonerLevel>100) {
			return -1;
		}
		return actualTonerLevel;
	}
	
	public int printPages(int pages) {
		int sheets = (duplex)?(pages/2)+(pages%2):pages;
		pagesPrinted+=sheets;
		
		if(duplex) {
			System.out.println("It's a duplex printer");
		}
		return sheets;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}

	public void setPagesPrinted(int pagesPrinted) {
		this.pagesPrinted = pagesPrinted;
	}
	
	

}
