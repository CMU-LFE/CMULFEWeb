package interfaces;

import java.util.ArrayList;

public interface TreeNode<T> {
	
	public T getPayload();
	public void setPayload(T payload);
	
	public ArrayList<TreeNode<T>> getChildren();
	public TreeNode<T> getPrimaryParent();
	public ArrayList<TreeNode<T>> getParents();
	
	public void setChildren(ArrayList<TreeNode<T>> children);
	public void setParents(ArrayList<TreeNode<T>> parents);
	
	public void addChild(TreeNode<T> child);
	public void addParent(TreeNode<T> parent);
	
}
