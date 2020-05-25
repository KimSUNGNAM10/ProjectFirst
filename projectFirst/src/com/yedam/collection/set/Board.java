package com.yedam.collection.set;

public class Board {

	String Title;
	String contents;
	String Editor;

	public Board(String Title, String contents, String Editor) {
		super();
		this.Title = Title;
		this.contents = contents;
		this.Editor = Editor;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getEditor() {
		return Editor;
	}

	public void setEditor(String editor) {
		Editor = editor;
	}

	@Override
	public String toString() {
		return "Title : " + Title + "contents : " + contents + "Editor : " + Editor;
	}
	
}
