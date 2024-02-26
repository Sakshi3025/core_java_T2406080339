//program for swapping dates
package session_05;

public class Date {

	private int dd, mm, yy;

	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	/*public static void swapDates(Date d1, Date d2) {
		Date temp;
		temp=d1;
		d1=d2;
		d2=temp;
		
	}*/
	
	public static void swapDates(Date d[]) {
		Date temp;
		temp=d[0];
		d[0]=d[1];
		d[1]=temp;
		
	}
	public static void main(String[] args) {
		Date[] d = new Date[2];
		Date d1 = new Date(15,2,2024);
		Date d2 = new Date(18,2,2023);
		d[0] = d1;
		d[1] = d2;
		
		System.out.println("before swapping: ");
		System.out.println("d1= "+ d[0]);
		System.out.println("d2= "+ d[1]);
		Date.swapDates(d);
		System.out.println("After swapping: ");
		System.out.println("d1= "+ d[0]);
		System.out.println("d2= "+ d[1]);
	}
}

