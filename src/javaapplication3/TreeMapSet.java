import java.util.TreeMap;

public class TreeMapSet implements WordSet{

    private TreeMap<String,String> rbTree;
   
    public TreeMapSet(){
        rbTree = new TreeMap();
    }
   
    @Override
    public void add(Word wordObject) {
        rbTree.put(wordObject.getWord(),wordObject.getType());
    }

    @Override
    @SuppressWarnings("element-type-mismatch")
    public Word get(Word word) {
        if(!rbTree.containsKey(word.getWord())){
            return null;
        }
        return new Word(rbTree.ceilingKey(word.getWord()),rbTree.get(rbTree.ceilingKey(word.getWord())));
    }

}
