/*

*/
public class WordLevels {

  private String words[];
  private String shownWord;
  private int countdown; // needs to be used
  private int xp;
  private int level;
  private Boolean active;

  public WordLevels(String words[]) {
    this.words = words;
    this.xp = 0;
    this.level = 0;
    this.shownWord = words[level];
    this.countdown = 0;
    this.active = true;
  }

  public WordLevels(String words[], Boolean active) {
    this.words = words;
    this.xp = 0;
    this.level = 0;
    this.shownWord = words[level];
    this.countdown = 0;
    // there's a way to have it the above copied from the first but not sure of it rn
    this.active = active;
  }

  public String getActiveWord() {
    return shownWord;
  }

  public Boolean getIfActive() {
    return active;
  }

  // current thing to do
  public void giveXP() {
    
  }

  // not utilized yet, will be expanded
  private void LevelUp(int level) {
    this.level = level;
    shownWord = words[level];
  }

  //filler xp values for now
  public void checkXP() {
    if (this.xp > 10) {
      this.LevelUp(1);
    } else if (this.xp > 100) {
      this.LevelUp(2);
    }
  }

  
}