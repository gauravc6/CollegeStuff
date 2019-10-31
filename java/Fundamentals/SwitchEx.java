public class SwitchEx{
  public static void setDifficulty(String player, String difficulty){
    System.out.println("Player "+player+" difficulty set to "+difficulty+" mode.");
  }
  public static void main(String[] args) {
    String player = "P2";
    int difficulty = 3;
    switch(player)
    {
      case "P1":
        switch (difficulty){
          case 1:
            setDifficulty("P1","Easy");
            break;
          case 2:
            setDifficulty("P1","Medium");
            break;
          case 3:
            setDifficulty("P1","Hard");
            break;
          }
      case "P2":
      switch (difficulty){
        case 1:
          setDifficulty("P2","Easy");
          break;
        case 2:
          setDifficulty("P2","Medium");
          break;
        case 3:
          setDifficulty("P2","Hard");
          break;
        }
    }
  }
}
