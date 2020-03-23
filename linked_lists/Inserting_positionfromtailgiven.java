/*Algorithm
1) find the length of the the linked list 
2) assuming the linkedlist starts from position 0, find the position where new node will be inserted by 
using the formula :- LENGTH OF LINKEDLIST - POSITION FROM TAIL SIDE - 1
3) create another reference variable node named 'prev', initialise it to null and initialise 'current' 
node to head.
4) now traverse to the position of insertion using current node.
5) put 'prev.next' to 'NewNODE'.
6) put 'NewNODE.next' to 'current'.
