package cpsc2150.listDec;

import java.util.List;

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
        T iT = get(i);
        T jT = get(j);
        tempVal = iT;
        iT = jT;
        jT = tempVal;
    }
}
