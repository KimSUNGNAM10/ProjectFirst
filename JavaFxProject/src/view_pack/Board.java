package view_pack;

import javafx.beans.property.SimpleStringProperty;

public class Board {
	private SimpleStringProperty title;
	private SimpleStringProperty password;
	private SimpleStringProperty publicity;
	private SimpleStringProperty exitDate;
	private SimpleStringProperty content;
	public SimpleStringProperty getTitle() {
		return title;
	}
	public SimpleStringProperty getPassword() {
		return password;
	}
	public SimpleStringProperty getPublicity() {
		return publicity;
	}
	public SimpleStringProperty getExitDate() {
		return exitDate;
	}
	public SimpleStringProperty getContent() {
		return content;
	}
	public Board(SimpleStringProperty title, SimpleStringProperty password, SimpleStringProperty publicity,
			SimpleStringProperty exitDate, SimpleStringProperty content) {
		super();
		this.title = title;
		this.password = password;
		this.publicity = publicity;
		this.exitDate = exitDate;
		this.content = content;
	}
	
}
