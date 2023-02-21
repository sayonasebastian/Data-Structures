// 102. Binary Tree Level Order Traversal
  function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
     this.left = (left===undefined ? null : left)
     this.right = (right===undefined ? null : right)
 }
 
/**
 * @param {TreeNode} root
 * @return {number[][]}
 */

 var levelOrder = function(root) {
    var mainlist=[],a=[],b=[];
    if(root!=null){
    a.push(root);
    while(a.length || b.length){
        var x=[],y=[];
        while(a.length){
            var t= a.shift();
            if(t.left)
                b.push(t.left);
            if(t.right)
                b.push(t.right);
            x.push(t.val);
        }
        if(x.length)
        mainlist.push(x);
        while(b.length){
            var s= b.shift();
            if(s.left)
                a.push(s.left);
            if(s.right)
                a.push(s.right);
            y.push(s.val);
        }
        if(y.length)
        mainlist.push(y);
    }
    }
    return mainlist;
    
};