import java.util.Scanner;

class Conversation {
  
  int rounds;
  Scanner input;

  public Conversation(){
    this.input = new Scanner(System.in);
  }

  public int howManyRounds(){
    System.out.println("How many rounds would you like to play?");
    this.rounds=this.input.nextInt();
    return rounds;
  }

  public String getResponse(){
    return this.input.nextLine();
  }

  public String mirror(String sentence){
    String[] words = sentence.split(" ");
    int length=words.length;
    for (int i=0; i < length;){
      if (words[i].equals("you")){
        words[i]="I";
      }
    }
    return String.join(", ", words);
  }
  public static void main(String[] arguments) {
    Conversation myConversation = new Conversation();  
    int rounds= myConversation.howManyRounds();

    System.out.println("Hi there!  What's on your mind?");
    myConversation.getResponse();
    for (int i=0; i<rounds; i++){
      String sentence=myConversation.getResponse();
      String newSentence=myConversation.mirror(sentence);
      System.out.println(newSentence);
      // System.out.println("mhmm meow");
    }

  }

}
