package constructor;

public class NormalOverloadingCaller {

	public static void main(String[] args) {
		NormalOverloading over = new NormalOverloading();
		over.add(10, 25);
		over.add(10, 25, 35);
		over.add(34.54f,66.55f,454.56f);

	}
	
	public static int main() {
		NormalOverloading over = new NormalOverloading();
		over.add(10, 25);
		over.add(10, 25, 35);
		over.add(34.54f,66.55f,454.56f);
		return 1;

	}

}
