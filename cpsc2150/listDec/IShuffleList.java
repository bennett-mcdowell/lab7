package cpsc2150.listDec;

import java.util.List;
import java.util.Random;

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
            int swapIndex1 = generator.nextInt(size());
            int swapIndex2 = generator.nextInt(size());
            swap(swapIndex1, swapIndex2);
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
        tempVal=myList[i];
        myList[i]=myList[j];
        myList[j]=tempVal;
    }
}
