function addNode(root, data) {
    if (!root) {
      root = {};
      root.data = data;
      root.left = null;
      root.right = null;
      return root;
    } else if (data > root.data) {
      root.right = addNode(root.right, data);
    } else if (data < root.data) {
      root.left = addNode(root.left, data);
    }
    return root;
  }
  
  function printTree(root) {
    if(root){
    printTree(root.left);
    printTree(root.right);}
  }
  let binaryTree = null;
  binaryTree = addNode(binaryTree, 23);
  binaryTree = addNode(binaryTree, 34);
  binaryTree = addNode(binaryTree, 11);
  printTree(binaryTree);
  