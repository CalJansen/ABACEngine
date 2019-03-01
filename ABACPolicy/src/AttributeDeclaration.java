public class AttributeDeclaration
{
	private String type;
	private String name;
	private AttributeDeclaration next;
	
	public AttributeDeclaration()
	{
		this.type = null;
		this.name = null;
		this.next = null;
	}
	
	public AttributeDeclaration(String type, String name)
	{
		this.type = type;
		this.name = name;
		this.next = null;
	}
	
	public void setNext(AttributeDeclaration next)
	{
		this.next = next;
	}
	
	public AttributeDeclaration getNext()
	{
		return this.next;
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void print()
	{
		System.out.println("Type: " + this.type);
		System.out.println("Name: " + this.name);
	}
}
