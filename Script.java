public class Script {
  private String lns[] = new String[2];

  // Something to draw from a txt file?
  public Script() {
    lns[0] = "I ___ do it.";
    lns[1] = "And I ___ do it again.";
  }

  public int getLength() {
    return lns.length;
  }
  
  public String getLine(int index) {
    return lns[index];
  } 

  public String newLine(int place, String word) {
    String r = lns[place].replace("___", word);
    return r;
  }

}