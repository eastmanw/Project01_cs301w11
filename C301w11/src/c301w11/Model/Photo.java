package c301w11.Model;

public class Photo
{
	private long photoId;
	private String description;
	private String tag;
	
	public long getId()
	{
		return photoId;
	}
	public void setId(long photoId)
	{
		this.photoId = photoId;
	}
	
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	
	public String toString()
	{
		return "PhotoId: " + (photoId) + ".  " + 
	"Description: " + description + ".  " +
				"Tag: " + tag + ".";
	}
}
