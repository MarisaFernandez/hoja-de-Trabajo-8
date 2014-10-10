/*
 * Word
 * 10 de Octubre del 2014
 * María Isabel Fernández 13024
 * Ana Bartra 13643
 * Andrés Lainfiesta 13072
 * Maria Gabriela López 13056
 */
 
class Word implements Comparable<Word> {
	private String word;
	private String type;
	
	// Constructor, inicializa la palabra con su tipo
	public Word(String word, String type)
	{
		this.word=word;
		this.type=type;
	}
	
	public Word()
	{
		this.word= "";
		this.type="";
	}
	
	// Comparadores, solo importa comparar la palabra, no el tipo.
	public int compareTo(Word o)
	{
		return this.word.compareTo(o.getWord());
	}
	
	public boolean equals(Object obj)
	{
		return (obj instanceof Word && getWord().equals(((Word)obj).getWord()));
	}
	
	// Métodos de acceso..
	public void setWord(String word)
	{
		this.word=word;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public String getWord()
	{
		return word;
	}
	
	public String getType()
	{
		return type;
	}
	
}
