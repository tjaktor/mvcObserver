package mvcObserver;

public class Controller
{
	private Model model;
	
	public Controller(Model model)
	{
		this.model = model;
	}
	
	public void assignText(String text)
	{
		this.model.setText(text);
	}
}
