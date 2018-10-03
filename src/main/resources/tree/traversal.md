####Traversal/Tree walks
    
Traversal is a way of visiting all the nodes in a tree in a specified order.
    
```Pre Order``` traversal
    we process each node ```before``` processing its children
    
```Post Order``` traversal
    we process the node ```after``` processing its children
    
```In Order``` traversal
    we process the left child first, then the root and then the right child
    
    
######Example of pre order -- Book or a Research paper.
      Title
      Abstract
      Chapter 1
          Section 1
          Section 2
      Chapter 2
           Section 1
           Section 2
      Conclusion                          
  
Iteratively:                               
 ```
 preOrder(root)
        visit root
        for each child c of root do:
            preOrder(c)
 ```
        
######Example of postOrder -- File System
      rootDir
          dir1
              file1
              file2
              file2
          dir2
              file1
          dir3
              file1
              file2
              file3

To compute total space utilized by rootDir = space(dir1) + space(dir2) + space(dir3)

First visit all the children, compute the spaces, then sum them up to get the value.

Iteratively:
```
postOrder(root)
    for each child c of root do:
        postOrder(c)
    visit root
```
    


Recursively:
```
preOrder(root, callBack)
    if(root == null) return;
    else
        callBack(root)
        preOrder(root.left())
        preOrder(root.right())
```
        
```
postOrder(root, callBack)
    if(root == null) return;
    else
        postOrder(root.left())
        postOrder(root.right())
        callBack(root)
```