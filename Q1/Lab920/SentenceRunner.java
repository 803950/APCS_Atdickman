    
    /**
     * Write a description of class SentenceRunner here.
     *
     * @author (your name)
     * @version (a version number or a date)
     */
public class SentenceRunner
{
    public static void main(){
        SentenceBuilder sentence = new SentenceBuilder();
        System.out.println("Sentence:     ");
        String noun_phrase = sentence.getNounPhrase();
        String verb_phrase = sentence.getVerbPhrase();
        String prepositional_phrase = sentence.getPrepositionalPhrase();
        System.out.println(noun_phrase + " " + verb_phrase + " " + prepositional_phrase);
    }
}
