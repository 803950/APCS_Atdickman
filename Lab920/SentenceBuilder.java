
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
    String[] adjectives = {"litle","big","communist","ugly","slippery","warm","hopeful","grateful","hungry","serious","quick", "brown","lazy","purpe","blue"}; //lengh = 15
    String[] determiners = {"the","my","your","his","hers","our","their","John's","Bob's","Joe's"}; //length = 10
    String[] adverbs = {"quickly","happily","smoothly","often","very","never","always","peacefully","frightfully","like a boss"}; //length = 10
    String[] prepositions = {"over","under","near","far from","on top of","underneath","behind","in front of","next to","inside of"}; //length = 10
    public void loadSentences(){
        
    }
    public void getSentences(){
        
    }
    public String getRandomNoun(){
        int index = (int)(Math.random()*nouns.length+1);
        return nouns[index];
    }
    System.out.print(getRandomNoun());
}
}