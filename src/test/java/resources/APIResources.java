package resources;

public enum APIResources {
	GetAllUserAPI("/api/users"),
	GetSingleUserAPI("/api/users"),
	GetSingleUserNotFoundAPI("/api/users"),
	GetListResourcesAPI("/api/unknown"),
	GetSingleResourceAPI("/api/unknown"),
	GetSingleResourceNotFoundAPI("/api/unknown"),
	PostCreateAPI("/api/users"),
	PutUpdateAPI("/api/users"),
	PatchUpdateAPI("/api/users"),
	DeleteUpdateAPI("/api/users"),
	PostRegisterSuccessfullAPI("/api/register"),
	PostRegisterUnsuccessfullAPI("/api/register"),
	PostLoginSuccessfullAPI("/api/login"),
	PostLoginUnuccessfullAPI("/api/login");
	
	
	public String resource;
	
	APIResources(String resource){
		this.resource = resource;
	}
	
	public String GetResource() {
		return this.resource;
	}
	
	

}
