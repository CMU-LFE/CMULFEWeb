package interfaces;

import java.util.Set;

public interface PledgeClassInterface {

	public String getName();
	public String getNickname();
	public Person getPC();
	public Set<Person> getMembers();
	public Person getAnchor();
	public int getSize();
	public String getCrossingDate();
	
}
