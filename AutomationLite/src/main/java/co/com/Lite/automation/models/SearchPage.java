package co.com.Lite.automation.models;

public class SearchPage {

	
        private String page;
        private String email;
    	private String password;

	
	public SearchPage(String page) {
		this.page = page;
	}


	public String getPage() {
		return page;
	}


	public void setPage(String page) {
		this.page = page;
	}
	
	
	
	public SearchPage(String email, String password) {
		this.email = email;
		this.password = password;
	
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

}


