/*
 * WordSetFactory
 * 10 de Octubre del 2014
 * María Isabel Fernández 13024
 * Ana Bartra 13643
 * Andrés Lainfiesta 13072
 * Maria Gabriela López 13056
 */
 
class WordSetFactory {
	
	// Metodo que genera un objeto que implementa WordSet
	// parametro tipo: 1 = SimpleSet
	//                         2 = implementado con Red black tree
	//                         3 = implementado con Splay Tree
	//                         4 = implementado con Hash Table
	//                         5 = implementado con TreeMap (de Java Collection Framework)
	
	public static WordSet generateSet(int tipo){
			// aqui se regresara el set empleando sus implementaciones:
			// if tipo == 2 cree una instancia para un Wordset implementao con Red Black Tree
			// if tipo == 3 cree una instancia para un Wordset implementado con Splay Tree
			// if tipo == 4 cree una instancia para un Wordset implementado con Hash table
			// if tipo == 5 cree una instancia para un Wordset implementado con TreeMap
	    if (tipo == 1){
		    return new SimpleSet();
		}
		if (tipo == 2)
		    return new RedBlackTreeSet();
		if (tipo == 3)
		    return new SplayTreeSet();
		if (tipo == 4)
		    return new TreeMapSet();
		if (tipo == 5)
		    return new HashTreeSet();
		else
			return null; //modificarlo para que regrese la implementacion seleccionada
	}
}
