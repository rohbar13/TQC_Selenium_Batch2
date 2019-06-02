package switching;

public class DaysSelection {

	// If i provide Sun the getDaysNumber should return 1
	// If i provide Mon the getDaysNumber should return 2

	public static void main(String arg[]) {
		String days = "mon";
		int dayNumber = getDaysNumber(days);

		System.out.println(dayNumber);
	}

	public static int getDaysNumber(String d) {
		if (d.equals("sun")) {
			return 1;
		} else if (d.equals("mon")) {
			return 2;
		} else if (d.equals("tue")) {
			return 3;
		} else if (d.equals("wed")) {
			return 4;
		} else if (d.equals("ths")) {
			return 5;
		} else if (d.equals("fri")) {
			return 6;
		} else if (d.equals("sat")) {
			return 7;
		}

		return 0;
	}

}
