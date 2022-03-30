/*
Handles the words as a whole, creates the WordLevels classes, and is an accessor for all of that
*/
public class WordData {

  public int getLength() {
    return wrd.length;
  }

  // just connecting down to WordLevels
  public String getShownWord(int i) {
    return wrd[i].getActiveWord();
  }
  public Boolean getActive(int i) {
    return wrd[i].getIfActive();
  }
  
  public void manageXP() {
    
  }

  // checking each word if its in the array and active
  public Boolean checkWord(String word) {
    for (int i=0; i<this.getLength(); i++) {
      if (wrd[i].getIfActive()) { 
        if (word.equals(wrd[i].getActiveWord())) {
          return true;
        }
      }
    }
    return false;
  }


  

  // I don't like how the information is handled; works for now but its not very clean.
  public void initializeWords() {
    String a[] = {"briskly", "quickly", "instantly"};
    WordLevels briskly = new WordLevels(a);
    String b[] = {"hesitantly", "slowly", "sluggishly"};
    WordLevels hesitantly = new WordLevels(b, true);
    String c[] = {"obviously"};
    WordLevels obviously = new WordLevels(c);

    wrd[0] = briskly;
    wrd[1] = hesitantly;
    wrd[2] = obviously;
  }

  private WordLevels wrd[] = new WordLevels[3];
}