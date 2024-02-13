package session_4;

public class Date {

	private int dd, mm, yy;
	//private final float PI=3.14f;
	// initialize final variable with value either while declaring or by create creating a default constructor and declaring it there.
/*	public Date() {
		PI= 3.14f;
	}
*/	
	
	public Date (int dd, int mm, int yy) {
		//PI=3.14f;
	    this.dd = dd;
        this.mm = mm;
        this.yy = yy;
}	
	
	
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	public static void main(String[] args) {
		/*final Date  newdate = new Date(1,6,90); //once final keyword is used then that specific variable value cannot be changed.
		newdate = new Date(1,6,80);

		System.out.println(newdate);*/
	}
	
	
}
