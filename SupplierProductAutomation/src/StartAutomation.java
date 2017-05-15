import com.supplyhouse.manager.AutomationJobManager;

public class StartAutomation {

	public static void main(String args[])
	{
		AutomationJobManager.getInstance().runJob();
	}
}
