/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
