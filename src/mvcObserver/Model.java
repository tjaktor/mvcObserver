package mvcObserver;
import java.util.ArrayList;
import java.util.List;

public class Model
{
	private String text;
	private List<Observer> observers = new ArrayList<Observer>();
	
	public Model()
	{
		this.text = "Default text";
	}
	
	public void registerObserver( Observer observer )
	{
		observers.add(observer);
	}
	
	public void notifyObservers()
	{
		for (Observer observer : observers)
		{
			observer.update();
		}
	}
	
	public void setText(String text)
	{
		this.text = text;
		notifyObservers();
	}
	
	public String getData()
	{
		return this.text;
	}
}
