import java.util.Objects;

public class Entity
{
	protected String entityName; 
	private AttributeInstance atHead;
	private AttributeInstance atTail;
	protected Entity next;
	
	public Entity()
	{
		this.entityName = null;
		this.atHead = null;
		this.atTail = null;
		this.next = null;
	}
	
	public Entity(String input)
	{
		this.entityName = input;
		this.atHead = null;
		this.atTail = null;
		this.next = null;
	}
	
	public void setNext(Entity newNext)
	{
		this.next = newNext;
	}
	
	public Entity getNext()
	{
		return this.next;
	}
	
	public String getName()
	{
		return this.entityName;
	}
	
	public void addAttribute(AttributeInstance newNode)
	{
		if(atHead == null)
		{
			this.atHead = newNode;
			this.atTail = newNode;
		} else
		{
			AttributeInstance current = atHead;
			boolean duplicate = false;
			
			while(current != null)
			{
				if(Objects.equals(current.getValue(), newNode.getValue()))
				{
					duplicate = true;
				}
				current = current.getNext();
			}
			
			if(duplicate == false)
			{
				this.atTail.setNext(newNode);
				this.atTail = newNode;
			}
		}
	}
}