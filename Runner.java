import java.util.Scanner;

public class Runner {

  private Scanner input;
  
  public Runner() {
    this.input = new Scanner(System.in);
  }

  // a little rough but works to show concept
  private void slowPrint(String text, int textSpeed) {
    for(int i = 0; i < text.length(); i++){
      System.out.print(text.charAt(i));
      try{
        Thread.sleep(textSpeed);
      }catch(InterruptedException ex){
        Thread.currentThread().interrupt();
      }
    }
  }

  // potentially can be broken down even further
  private void runScript(int index, SaveData saveData, Script script, WordData wordData) {
    this.slowPrint(script.getLine(index), saveData.getTextSpeed());
    System.out.println();
    this.slowPrint(this.getWords(wordData), saveData.getTextSpeed());
    System.out.println();
    System.out.print("input: ");
    
    while (true) {
      String word = input.nextLine();
      // bug below, 1 too many spaces printed when nothing is inputed
      if (word == "" || wordData.checkWord(word)) {
        this.slowPrint(script.newLine(index, word), saveData.getTextSpeed());
        System.out.println();
        break;
      } else {
        this.slowPrint("That is not an option, try again: ̈", saveData.getTextSpeed());
      }
    }
  }

  public String getWords(WordData wordData) {
    String words = "Your options are: ";
    for (int i=0; i<wordData.getLength(); i++) {
      if (wordData.getActive(i)) {
        if (i == wordData.getLength()-1) {
          words += "and " + wordData.getShownWord(i);
        } else {
          if (i == wordData.getLength()-2){
            words += wordData.getShownWord(i) + ", ";       
          } else {
            words += wordData.getShownWord(i) + " ";
          }
        }
      }
    }
    return words;
  }

  public void run(SaveData saveData, Script script, WordData wordData) {
    for (int i=0; i< script.getLength(); i++) {
      this.runScript(i, saveData, script, wordData);
    }
  }
  
}