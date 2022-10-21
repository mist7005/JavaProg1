package prac;

public class Language extends FrontEnd implements BackEnd {
	String language="Java";

	public void connectServer()
	{
		System.out.println(language+" can be used as backend language");
	}
	public static void main(String[] args) {
		Language l=new Language();
		l.connectServer();
		l.responsive(l.language);
		
	}

}
