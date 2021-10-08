package computers;

public class Computers {
//	Create a Computer class that has 3 variables. 
//	The first variable will have a name. 
	String name;
	
//	The second variable will be the year of the computer. 
	String year;
	
//	Last variable will be the cost of the computer.
	int cost;
//
//	All 3 variables should be private instance variables and must 
//	use getters to retrieve the data and setters to set the variables.


	public static void main(String[] args) {
		
		Computers c = new Computers();
		
		
		c.name = ("Mac");
		c.year = ("2019");
		c.cost = (3000);
		System.out.println(c.getName());
		System.out.println(c.getYear());
		System.out.println(c.getCost());
		
		c.print();
	
	}
	

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getYear() {
		return year;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}
	public void print() {
		System.out.println("My " + name + " computer is a " + year + " it cost " + cost + " dollars." );
	}


	 
}
