package mvcObserver;
public class View implements Observer 
{
	private String name;
	private String text;
	
	private Model model;
	
	public View( String name, Model model )
	{
		this.name = name;
		this.model = model;
		this.model.registerObserver( this );
	}
	
	public void update()
	{
		String data = this.model.getData();
		
		this.text = data;
	}
	
	public String retrieveName()
	{
		return this.name;
	}
	
	public String text()
	{
		return this.text;
	}
}
