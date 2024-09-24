import java.util.Scanner;
import java.util.ArrayList;
class Conversation {
  
  //atributes of conversation class
  int rounds;
  Scanner input;

  //constructer 
  public Conversation(){
    this.input = new Scanner(System.in);
  }

  //ask for how many rounds to play and retrun that value to be used later 
  public int howManyRounds(){
    System.out.println("How many rounds would you like to play?");
    this.rounds=this.input.nextInt();
    return rounds;
  }

  //how to use the scanner to get another instance of user input 
  public String getResponse(){
    return this.input.nextLine();
  }

  //mirrors the input to different values 
  public String mirror(String sentence){
    String[] words = sentence.split(" ");
    int length=words.length;
    int counter=0;
    for (int i=0; i < length; i++){

      if (words[i].equals("you")){
        words[i]="i";
        counter ++;
      }
      else if (words[i].equals("i")){
        words[i]="you";
        counter ++;

      }
      else if (words[i].equals("me")){
        words[i]="you";
        counter ++;

      }
      else if (words[i].equals("am")){
        words[i]="are";
        counter ++;

      }
      else if (words[i].equals("my")){
        words[i]="your";
        counter ++;

      }
      else if (words[i].equals("your")){
        words[i]="my";
        counter ++;

      }
    }
    String newWords=String.join(" ", words)+"?";
    if (counter<1){
      newWords="mhmm very interesting";
    }
    return newWords;
  }
  public static void main(String[] arguments) {
    Conversation myConversation = new Conversation();  
    int rounds= myConversation.howManyRounds();

    //help
    ArrayList<String> transcript = new ArrayList<String>();    // List<String> transcripts = new ArrayList<>();
    // transcripts.add("How many rounds would you like to play?");
    // transcripts.add(String rounds);

    System.out.println("Hi there!  What's on your mind?");
    transcript.add("Hi there!  What's on your mind?");
    myConversation.getResponse();
    for (int i=0; i<rounds; i++){
      String sentence=myConversation.getResponse();
      transcript.add(sentence);
      String newSentence=myConversation.mirror(sentence);
      transcript.add(newSentence);
      System.out.println(newSentence);
      // System.out.println("mhmm meow");
    }
    System.out.println("Thanks for talking");
    transcript.add("Thanks for talking");

    int lengthy= (rounds*2+2);
    for (int k=0; k< lengthy; k++){
      System.out.println(transcript.get(k));
    }

  }

}
