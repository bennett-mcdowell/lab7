package cpsc2150.listDec;

import java.util.List;

/**
 * ShuffleList extends the existing List class in java, allowing more functionality for users (specifically a swap and shuffle function)
 * 
 * Initialization ensures:
 *  A list is initialized to contain values of type T
 * 
 * Defines:
 *  self: the list structure itself
 * 
 * Constraints:
 *  |self| >= 0
 */

interface IShuffleList<T> extends List<T> {

    /**
     * Randomly picks 2 positions in the list and swaps them
     * 
     * @param swaps the number of swaps to perform
     * 
     * @pre 
     * 
     * @post
     * 
     */
    default void shuffle(int swaps) {
    //randomly generate number 1
    //randomly generate number 2
    //modulo size of the list 
    }

    /**
     * The swap function will exchange the values at positions i and j in the list.
     * 
     * @param i the first position to swap
     * @param j the second position to swap
     * 
     * @pre 
     * 
     * @post 
     * 
     */ 

    default void swap(int i, int j) {
        T tempVal;
        tempVal=myList[i];
        myList[i]=myList[j];
        myList[j]=tempVal;
    }
}
