# objects of LinkedList class is able to store integer numbers.

Methods:

addLast(int element) -> it adds an integer number to the end of the list.</br>
soma() -> it returns the sum of all values stored in the linked list.</br>
isSorted() - it returns a boolean value. True case the list is sorted in ascending order, false, otherwise.</br>
size() -> returns the size of the list.</br>
All the methods above are implemented recursively.</br>


</br>
</br>





add(int index, int element) -> it adds an integer number to the specified index of the list if it's in range index > 0 and index <= size and pushes forward the element which was previously in that index. If an illegal index is given, it does nothing.
Obs.: this method does not change the old value from its previous index, it basically puts the new value between the old ones, except for the index 0.

</br>
remove(int index) -> it removes an element if it's in range index > 0 and index < size.

 




