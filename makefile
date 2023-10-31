default: cpsc2150/listDec/IShuffleList.java cpsc2150/listDec/ShuffleApp-1.java cpsc2150/listDec/ShuffleList-1.java
	javac cpsc2150/listDec/IShuffleList.java cpsc2150/listDec/ShuffleApp-1.java cpsc2150/listDec/ShuffleList-1.java

run: cpsc2150/listDec/IShuffleList.class cpsc2150/listDec/ShuffleApp-1.class cpsc2150/listDec/ShuffleList-1.class
	java cpsc2150.listDec.ShuffleApp

clean:
	rm -f cpsc2150/listDec/*.class