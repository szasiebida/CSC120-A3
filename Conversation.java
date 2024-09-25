import java.util.Scanner;
class Conversation {
  
  //atributes of conversation class
  int rounds;
  Scanner input;

  //constructer 
  /**
   * constructor that sets up the scanner
   */
  public Conversation(){
    this.input = new Scanner(System.in);
  }

  /**
   * asks the user how many rounds they want to play and returns the value to be used later
   * 
   * @return rounds the int of the number of rounds they want to play
   */
  //ask for how many rounds to play and retrun that value to be used later 
  public int howManyRounds(){
    System.out.println("How many rounds would you like to play?");
    this.rounds=this.input.nextInt();
    return rounds;
  }

  /**
   * gets the next user input from the scanner 
   * 
   * @return the next line of the user input 
   */
  //how to use the scanner to get another instance of user input 
  public String getResponse(){
    return this.input.nextLine();
  }

  /**
   * mirror function where the program mirrors specifc words and figures out how to respond 
   * 
   * @param sentence the input of the user as one long string
   * @return the response the program will print to the terminal after mirroring words or not
   */
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

  /**
   * main function where the conversation takes place prints the transcript as the conversation terminates 
   * 
   * @param arguments
   */
  public static void main(String[] arguments) {
    Conversation myConversation = new Conversation();  
    int rounds= myConversation.howManyRounds();

    String[] transcript = new String[rounds*2+2]; 


    System.out.println("Hi there!  What's on your mind?");
    transcript[0]=("Hi there!  What's on your mind?");
    myConversation.getResponse();
    if (rounds==1){
      String sentence=myConversation.getResponse();
      transcript[1]=(sentence);
      String newSentence=myConversation.mirror(sentence);
      transcript[2]=(newSentence);
      System.out.println(newSentence);
    }
    else {
      for (int i=0; i<rounds+2;){
      String sentence=myConversation.getResponse();
      transcript[i+1]=(sentence);
      String newSentence=myConversation.mirror(sentence);
      transcript[i+2]=(newSentence);
      System.out.println(newSentence);
      i=i+2;
    }
    }
      
    System.out.println("Thanks for talking");
    transcript[rounds*2+2-1]=("Thanks for talking");


    int lengthy= (rounds*2+2);
    for (int k=0; k< lengthy; k++){
      System.out.println(transcript[k]);
    }

  }

}
