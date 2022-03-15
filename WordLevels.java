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

  public String getShownWord() {
    return shownWord;
  }

  public Boolean getActive() {
    return active;
  }

  // not utilized yet, will be expanded
  private void LevelUp() {
    level++;
    shownWord = words[level];
  }

  //filler xp values for now, would break if it would level up twice
  public void checkXP() {
    if (this.level == 0 && this.xp > 10) {
      this.LevelUp();
    } else if (this.level == 1 && this.xp > 100) {
      this.LevelUp();
    }
  }

  
}