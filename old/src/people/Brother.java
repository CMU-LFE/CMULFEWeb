package people;

import interfaces.Person;

public class Brother implements Person {

	private String name;
	private String nickname;
	private int number;
	private String crossingDate;
	
	public Brother(String name, String nickname, int number, String crossingDate){
		this.name = name;
		this.nickname = nickname;
		this.number = number;
		this.crossingDate = crossingDate;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getNickname() {
		return nickname;
	}

	@Override
	public int getNumber() {
		return number;
	}
	
	@Override
	public String getCrossingDate() {
		return crossingDate;
	}

}
