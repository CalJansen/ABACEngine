
public class Permission
{
	private String permissionName;
	private Permission next;
	
	public Permission()
	{
		this.permissionName = null;
		this.next = null;
	}
	
	public Permission(String input)		// class constructor
	{
		this.permissionName = input;
		this.next = null;
	}
	
	public Permission getNext()
	{
		return this.next;
	}
	
	public void setNext(Permission newNext)
	{
		this.next = newNext;
	}
	
	public String getName()
	{
		return this.permissionName;
	}
	
	public void print()
	{
		System.out.println(this.permissionName);
	}
}
