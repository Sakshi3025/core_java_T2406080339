package session_4;

public class enumeration {
	public enum Seasons{SUMMER, WINTER, SPRING};//semicolon is not necessary when using enum
	public static void main(String[] args) {
		Seasons s = Seasons.SUMMER;
		System.out.println(s);
		
		for(Seasons s1:Seasons.values())
		{
			System.out.println(s1+ " " + s1.ordinal());
		}
	}

}
