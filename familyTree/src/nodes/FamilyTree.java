package nodes;

import java.util.ArrayList;

import interfaces.Person;
import interfaces.TreeNode;

public class FamilyTree implements TreeNode<Person> {

	private Person person;
	
	private ArrayList<TreeNode<Person>> parents = new ArrayList<TreeNode<Person>>();
	private ArrayList<TreeNode<Person>> children = new ArrayList<TreeNode<Person>>();
	
	public FamilyTree(Person person){
		this.person = person;
	}	
	
	@Override
	public Person getPayload() {
		return person;
	}

	@Override
	public void setPayload(Person payload) {
		person = payload;
	}
	
	@Override
	public ArrayList<TreeNode<Person>> getChildren() {
		return children;
	}

	@Override
	public TreeNode<Person> getPrimaryParent() {
		return parents.get(0);
	}

	@Override
	public ArrayList<TreeNode<Person>> getParents() {
		return parents;
	}

	@Override
	public void addParent(TreeNode<Person> parent) {
		parents.add(parent);
		
	}
	
	@Override
	public void addChild(TreeNode<Person> child){
		children.add(child);
	}
	
	@Override
	public void setParents(ArrayList<TreeNode<Person>> parents) {
		this.parents = parents;
	}
	
	@Override
	public void setChildren(ArrayList<TreeNode<Person>> children) {
		this.children = children;
	}
	
}
