/*
 * SplayTreeSet
 * 10 de Octubre del 2014
 * María Isabel Fernández 13024
 * Ana Bartra 13643
 * Andrés Lainfiesta 13072
 * Maria Gabriela López 13056
 */
 
class SplayTreeSet implements WordSet
{
	private SplayTree<Word> base;
	
	public SplayTreeSet()
	{
		base = new SplayTree();
	}
	
	public Word get(Word word)
	{
		return base.get(word);
	}
	
	public void add(Word wordObject)
	{
		base.add(wordObject);
	}
}
