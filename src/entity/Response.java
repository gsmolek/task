package entity;
/**
 * 
 * @author MOLEK
 * Response entity
 */
public class Response {
	private String id = null;
	private String name = null;
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Response [id=" + id + ", name=" + name + "]";
	}
	
}
