package input_pack;

public class Board {
	private String title;
	private String password;
	private String publicity;
	private String exitDate;
	
	
	public String getTitle() {
		return title;
	}
	public String getPassword() {
		return password;
	}
	public String getPublicity() {
		return publicity;
	}
	public String getExitDate() {
		return exitDate;
	}
	public String getCotent() {
		return cotent;
	}
	
	
	public Board(String title, String password, String publicity, String exitDate, String cotent) {
		super();
		this.title = title;
		this.password = password;
		this.publicity = publicity;
		this.exitDate = exitDate;
		this.cotent = cotent;
	}
	private String cotent;
}
