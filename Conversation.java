import java.util.Scanner;

class Conversation {
  
  int rounds;
  Scanner input;

  public Conversation(){
    this.input = new Scanner(System.in);
  }

  public int howManyRounds(){
    System.out.print("How many rounds would you like to play?");
    this.rounds=this.input.nextInt();
    return rounds;
  }

  public static void main(String[] arguments) {
    Conversation myConversation = new Conversation();  
    int rounds= myConversation.howManyRounds();

    System.out.print("Hi there!  What's on your mind?");
    for (int i=0; i<rounds; i++){
      myConversation.input=new Scanner(System.in);
      String sentence = myConversation.input.nextLine();
      String[] words = sentence.split(" ");
      if ("I" in words)
    }

  }

}
