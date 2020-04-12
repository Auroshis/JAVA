if(root==null)
return false;
if(root.data == x)
return true;

return search(root.left,x) || search(root.right,x);