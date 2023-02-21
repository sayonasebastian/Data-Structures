package Tree.BinarySearchTree;
import Tree.TreeNode;
import java.util.*;

//98. Validate Binary Search Tree
public class ValidateBST {
    List<Integer> l;
    public ValidateBST(){
        l= new ArrayList<Integer>();
    }
    public void getArray(TreeNode root){
        if(root==null)
            return;
        getArray(root.left);
        l.add(root.val);
        getArray(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        getArray(root);
       for(int i=0;i<l.size()-1;i++){
           if(l.get(i)>=l.get(i+1))
               return false;
       }
        return true;
    }

}
