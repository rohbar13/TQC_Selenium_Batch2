package constructor;

public class PrivateClassLogic {
	
	private PrivateClassLogic()
	{
		
	}
	
	private static PrivateClassLogic pcl;
	
	public static PrivateClassLogic getObject() {
		
		if(pcl==null)
		{
			pcl = new PrivateClassLogic();
		}
		
		return pcl;
		
	}
	
	
}
