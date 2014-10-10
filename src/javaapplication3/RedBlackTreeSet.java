public class RedBlackTreeSet implements WordSet{
   //-----------------------------------------------------------------------
    private RedBlackTree<Word> rbt;
   
    //------------------------------------------------------------------------
    // Métodos
    //------------------------------------------------------------------------

    /*
     * Constructor que crea la nueva implementación a utilizar.
     * @pre: -
     * @post: Se construye la implementación.
     */
    public RedBlackTreeSet(){
        rbt = new RedBlackTree<Word>();
    }

    /*
     * Método que agrega una nueva palabra al conjunto.
     * pre: -
     * post: Se agrega la palabra.
     * parametros wordObject
     */
    @Override
    public void add(Word wordObject) {
        rbt =rbt.add(wordObject);
    }

    /*
     * Método que obtiene y determina si existe una palabra en el conjunto.
     * pre: La palabra debe existir.
     * post: Se regresa la palabra.
     * parametros word
     * return word
     */
    @Override
    public Word get(Word word){
        return rbt.get(word);      
    }
   
}
