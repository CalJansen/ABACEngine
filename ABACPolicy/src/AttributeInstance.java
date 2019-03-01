
public class AttributeInstance
{
	private String name;
	private String value;
	private AttributeInstance next;
	
	public AttributeInstance()
	{
		this.name = null;
		this.value = null;
		this.next = null;
	}
	
	public AttributeInstance(String name, String value)
	{
		this.name = name;
		this.value = value;
		this.next = null;
	}
	
	public void setNext(AttributeInstance next)
	{
		this.next = next;
	}
	
	public AttributeInstance getNext()
	{
		return this.next;
	}
	
	public String getValue()
	{
		if(this.value != null)
		{
			return this.value;
		}
		else 
		{
			return "wrong";
		}
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getFullAttribute()
	{
		String full = "";
		full = this.name + this.value;
		return full;
	}
	
	public void print()
	{
		System.out.println("Name: " + this.name);
		System.out.println("Value: " + this.value);
	}
}
