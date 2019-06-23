package constructor;

public class PrivateClassLogic_Caller {

	public static void main(String a[]) {

		PrivateClassLogic pcl = PrivateClassLogic.getObject();
		PrivateClassLogic pcl2 = PrivateClassLogic.getObject();
		
		if(pcl==pcl2)
		{
			System.out.println("Both the objects are same");
		}else
		{
			System.out.println("Both the objects are not same");
		}
		
	}

}
