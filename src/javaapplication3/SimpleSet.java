
/*
 * HashTreeSet
 * 10 de Octubre del 2014
 * María Isabel Fernández 13024
 * Ana Bartra 13643
 * Andrés Lainfiesta 13072
 * Maria Gabriela López 13056
 */
 
import java.util.ArrayList;

class SimpleSet implements WordSet
{
	private ArrayList<Word> base;
	
	public SimpleSet()
	{
		base = new ArrayList<Word>();
	}
	
	public Word get(Word word)
	{
		int index = base.indexOf(word);
		if(index == -1) return null;
		return base.get(index);
	}
	
	public void add(Word wordObject)
	{
		base.add(wordObject);
	}
}
