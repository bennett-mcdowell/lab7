package cpsc2150.listDec;

import java.util.List;
import java.util.Random;

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
    default void shuffle(int swaps){
        Random generator = new Random();
        for(int i = 0; i < swaps; i++)
        {
            int swapIndex1 = generator.nextInt(myList.size());
            int swapIndex2 = generator.nextInt(myList.size());
            T tempVal = myList[swapIndex1];
            myList[swapIndex1] = myList[swapIndex2];
            myList[swapIndex2] = tempVal;
        }
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
        T iT = get(i);
        T jT = get(j);
        tempVal = iT;
        iT = jT;
        jT = tempVal;
    }
}
