/**
 * builds sentences
 *
 * @author tdickman
 * @version 920
 */
import java.lang.Math;
public class SentenceBuilder
{
    String[] nouns = {"apple","carrot","pumpkin","potato","computer","pencil","pen","paper","shirt","sock","dog","cat","man","lemon","mouse","door","house","fox","book","business","case","child","company","country","day"}; //length = 25
    String[] verbs = {"jumped","ran","flew","ate","made","chopped","wanted","sang","threw","drew"}; //length = 10
    String[] adjectives = {"litle","big","communist","ugly","slippery","warm","hopeful","grateful","hungry","serious","quick", "brown","lazy","purple","blue"}; //lengh = 15
    String[] determiners = {"the","my","your","his","her","our","their","John's","Bob's","Joe's"}; //length = 10
    String[] adverbs = {"quickly","happily","smoothly","often","never","always","peacefully","frightfully","like a boss"}; //length = 10
    String[] prepositions = {"over","under","near","far from","on top of","underneath","behind","in front of","next to","inside of"}; //length = 10
    public String getRandom(String[] wordarray){
        int index = (int)(Math.random()*wordarray.length);
        return wordarray[index];
    }    
    
    public String getSentences(){
        return("default");
    }
    public String getRandomNoun(){
        return(getRandom(nouns));
    }
    public String getRandomVerb(){
        return(getRandom(verbs));
    }
    public String getRandomAdjective(){
        return(getRandom(adjectives));
    }
    public String getRandomAdverb(){
        return(getRandom(adverbs));
    }
    public String getRandomDeterminer(){
        return(getRandom(determiners));
    }
    public String getRandomPreposition(){
        return(getRandom(prepositions));
    }
    public String getNounPhrase(){
        return(getRandomDeterminer() + " " + getRandomAdjective() + " " + getRandomNoun());
    }
    public String getVerbPhrase(){
        return(getRandomAdverb() + " " + getRandomVerb());
    }
    public String getPrepositionalPhrase(){
       return(getRandomPreposition() + " " + getRandomDeterminer() + " " + getRandomAdjective() + " " + getRandomNoun());
    }
}
