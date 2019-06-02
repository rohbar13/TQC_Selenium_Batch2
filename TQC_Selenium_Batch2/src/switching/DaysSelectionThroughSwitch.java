package switching;

public class DaysSelectionThroughSwitch {

	// If i provide Sun the getDaysNumber should return 1
	// If i provide Mon the getDaysNumber should return 2

	public static void main(String arg[]) {
		String days = "fri";
		int dayNumber = getDaysNumber(days);

		System.out.println(dayNumber);
	}

	public static int getDaysNumber(String d) {
		int x = 0;
		switch (d) {
		case "sun":
			x = 1;
			break;
		case "mon":
			x = 2;
			break;
		case "tue":
			x = 3;
			break;
		case "wed":
			x = 4;
			break;
		case "ths":
			x = 5;
			break;
		case "fri":
			x = 6;
			break;
		case "sat":
			x = 7;
		default:
			x = 0;
		}
		return x;
	}

}
