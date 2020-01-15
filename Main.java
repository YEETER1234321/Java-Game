import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
class Main {
  public static void main(String[] args) {
    Scanner input1 = new Scanner(System.in);
    System.out.println("Type new or load");
    String input1string = input1.nextLine();
    if(input1string == "new") {
      File save1open = new File("save1.txt");
      File save2open = new File("save2.txt");
      File save3open = new File("save3.txt");
      File save4open = new File("save4.txt");
      Scanner save1reader = new Scanner(save1open);
      Scanner save2reader = new Scanner(save2open);
      Scanner save3reader = new Scanner(save3open);
      Scanner save4reader = new Scanner(save4open);
      if(save1reader.hasNextLine()) {
        System.out.println("Save 1 has been used");
      }
      if(save2reader.hasNextLine()) {
        System.out.println("Save 2 has been used");
      }
      if(save3reader.hasNextLine()) {
        System.out.println("Save 3 has been used");
      }
      if(save4reader.hasNextLine()) {
        System.out.println("Save 4 has been used");
      }
    }
  }
}
