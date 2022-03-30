/*

*/
public class Script {
  private String lns[] = new String[5];

  // Something to draw from a txt file?
  public void initializeScript() {
    lns[0] = "I ___ do it.";
    lns[1] = "And I ___ do it again.";
    lns[2] = "Let me ___ do this one more time.";
    lns[3] = "How about I do it ___?";
    lns[4] = "___ I do it.";
  }

  public int getLength() {
    return lns.length;
  }
  
  public String getLine(int index) {
    return lns[index];
  } 

  // if at start of the sentence it doesn't capitalize
  public String newLine(int place, String word) {
    String r = lns[place].replace("___", word);
    return r;
  }

}