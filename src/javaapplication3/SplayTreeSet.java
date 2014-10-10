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