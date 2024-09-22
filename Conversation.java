import java.util.Scanner;

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
    System.out.println(words[0]);
    for (int i=0; i < length-1; i++){
      System.out.println(i);

      if (words[i].equals("you")){
        System.out.println("woof");
        words[i]="I";
      }
      // else if (words[i].equals("I")){
      //   words[i]="you";
      //   break;
      // }
      // else if (words[i].equals("me")){
      //   words[i]="you";
      //   break;
      // }
      // else if (words[i].equals("am")){
      //   words[i]="are";
      //   break;
      // }
      // else if (words[i].equals("my")){
      //   words[i]="your";
      //   break;
      // }
      // else if (words[i].equals("your")){
      //   words[i]="my";
      //   break;
      // }
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
