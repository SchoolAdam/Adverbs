/*
This class is currently a bit of a mess
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

  // Fetches the active words, will be expanded to fetch based on situations
  // overlaps a bit in purpose with Runner, fine for now
  public String getWords() {
    String words = "Your options are: ";
    for (int i=0; i<this.getLength(); i++) {
      if (wrd[i].getActive()) {
        if (i == this.getLength()-1) {
          words += "and " + wrd[i].getShownWord();
        } else {
          if (i == this.getLength()-2){
            words += wrd[i].getShownWord() + ", ";       
          } else {
            words += wrd[i].getShownWord() + " ";
          }
        }
      }
    }
    return words;
  }

  // checking each word if its in the array and active
  public Boolean checkWord(String word) {
    for (int i=0; i<this.getLength(); i++) {
      if (wrd[i].getActive()) { 
        if (word.equals(wrd[i].getShownWord())) {
          return true;
        }
      }
    }
    return false;
  }
}