package cpsc2150.listDec;

import java.util.List;

interface IshuffleList<T> extends List<T>{
default void shuffle(int swaps){
//randomly generate number 1
//randomly generate number 2
//modulo size of the list 
}
default void swap(int i, int j){
T tempVal;
tempVal=myList[i];
myList[i]=myList[j];
myList[j]=tempVal;
}
}
