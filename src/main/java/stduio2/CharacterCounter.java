package stduio2;

import java.util.ArrayList;
import java.util.HashMap;

public class CharacterCounter {
    public CharacterCounter() {

    }

    public void countCharacters(String wordToCount) {
        char[] arrayOfChars = wordToCount.toCharArray();
        HashMap<Character, Integer> myCharacterCount = new HashMap<>();
        for (int i = 0; i < arrayOfChars.length; i++) {
            System.out.println(arrayOfChars[i]);
            char theCharacter = arrayOfChars[i];
            if (myCharacterCount.containsKey(theCharacter) == false) {
                myCharacterCount.put(theCharacter, 1);
            } else {
                Integer theValue = myCharacterCount.get(theCharacter);
                theValue = theValue + 1;
                myCharacterCount.put(theCharacter, theValue);
            }
        }


        ArrayList<Character> myCharacterKeys = new ArrayList<>(myCharacterCount.keySet());
        System.out.println(myCharacterKeys);
        for(int i=0; i<myCharacterKeys.size(); i++) {
         Integer theVale = myCharacterCount.get(myCharacterKeys.get(i));
            System.out.println(myCharacterKeys.get(i) + ":" + theVale);
        }
        }
    }
