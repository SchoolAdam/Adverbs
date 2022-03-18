/*
Note that this is all a proof of concept for now

Next thing: XP Tracking
*/
public class Main {
  public static void main(String[] args) {
    Runner runner = new Runner();
    SaveData saveData = new SaveData(50); //fine-tune nums later
    Script script = new Script();
    WordData wordData = new WordData();
    script.initializeScript();
    wordData.initializeWords();

    runner.run(saveData, script, wordData);
  }
}