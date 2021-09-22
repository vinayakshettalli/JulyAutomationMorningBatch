
public class WindowsComponent {
         
	public static void main(String[] args) {
		try
		{
			Runtime obj=Runtime.getRuntime();
			obj.exec("D:\\AutoIT\\Example.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
