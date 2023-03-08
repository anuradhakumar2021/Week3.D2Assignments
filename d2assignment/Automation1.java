package Week3.d2assignment;

public class Automation1 extends MultipleLanguage{

	public static void main(String[] args) {
		
			Automation1 obj=new Automation1();
			obj.Java();
			obj.Selenium();
			obj.python();
			obj.ruby();
			
		}

		public void Selenium() {
			System.out.println("Selenium is a Automation Framework");
			
		}

		public void Java() {
			System.out.println("Java is Base Language for Selenium WebDriver");
			
		}

		@Override
		public void ruby() {
			System.out.println("Ruby is a Scripting Language");
	}

}
