/*
Note that this is all a proof of concept for now

*/
public class Main {
  public static void main(String[] args) {
    Runner runner = new Runner();
    SaveData saveData = new SaveData(50); //fine-tune nums later
    Script script = new Script();
    WordData wordData = new WordData();
    wordData.initalizeWords();

    runner.run(saveData, script, wordData);
  }
}