/*
 * HashTreeSet
 * 10 de Octubre del 2014
 * María Isabel Fernández 13024
 * Ana Bartra 13643
 * Andrés Lainfiesta 13072
 * Maria Gabriela López 13056
 */
 
import java.util.HashMap;

public class HashTreeSet implements WordSet{

    private HashMap<String,String> hash;
   
    public HashTreeSet(){
        hash = new HashMap();
    }
   
    @Override
    public void add(Word wordObject) {
        hash.put(wordObject.getWord(),wordObject.getType());
    }

    @Override
    public Word get(Word word) {
        if(!hash.containsKey(word.getWord())){
            return null;
        }
        return new Word(word.getWord(),hash.get(word.getWord()));
    }
   
}
