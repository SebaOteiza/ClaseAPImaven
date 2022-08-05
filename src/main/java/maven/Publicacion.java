package maven;

public class Publicacion {
	//ejemplo proyecto mave
	//en el POM.XML LOS ARCHIVOS SE PEGAN ENTRE <NAME> Y </PROJECT>
	
	
	
	private Integer userId;
	private Integer Id;
	private String title;
	private String body;
	
	

	
	//GETTERS AND SETTERS 
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	
	// TO STRING 
	
	@Override
	public String toString() {
		return "Publicacion [userId=" + userId + ", Id=" + Id + ", title=" + title + ", body=" + body + "]";
	}
	
	

}
