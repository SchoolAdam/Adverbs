/*
This class is currently a bit of a mess, needs to be spread out to others
*/
public class WordData {
  // switch it to a 2D array? move to SaveData? set values here?
  private WordLevels wrd[] = new WordLevels[3];

  public WordData() {
  }

  // I don't like how the information is handled; works for now but its not very clean.
  // is there a way to take an array as a parameter in one line? 
  public void initalizeWords() {
    String a[] = {"briskly", "quickly", "instantly"};
    WordLevels briskly = new WordLevels(a);
    wrd[0] = briskly;
    String b[] = {"hesitantly", "slowly", "sluggishly"};
    WordLevels hesitantly = new WordLevels(b, false);
    wrd[1] = hesitantly;
    String c[] = {"obviously"};
    WordLevels obviously = new WordLevels(c);
    wrd[2] = obviously;
  }

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
}