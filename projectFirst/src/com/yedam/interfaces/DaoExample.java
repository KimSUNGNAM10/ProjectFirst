package com.yedam.interfaces;

interface DateAccessObject {
	void select();

	void insert();

	void update();

	void delete();
}

class OracleDao implements DateAccessObject {
	String dbType = "Oracle DB";

	@Override
	public void select() {
		System.out.println(dbType + "에서 검색");

	}

	@Override
	public void insert() {
		System.out.println(dbType + "에 삽입");
	}

	@Override
	public void update() {
		System.out.println(dbType + "를 수정");
	}

	@Override
	public void delete() {
		System.out.println(dbType + "에서 삭제");
	}

}

class MysqlDao implements DateAccessObject {
	String dbType = "MySql DB";

	@Override
	public void select() {
		System.out.println(dbType + "에서 검색");

	}

	@Override
	public void insert() {
		System.out.println(dbType + "에 삽입");

	}

	@Override
	public void update() {
		System.out.println(dbType + "를 수정");

	}

	@Override
	public void delete() {
		System.out.println(dbType + "에서 삭제");

	}

}

public class DaoExample {
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
	}

	public static void dbWork(DateAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
}
