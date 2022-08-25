package ArrayList;

import java.util.ArrayList;

public class ArrayListOpg {

  private  String testString1;
  private  String testString2;
  private ArrayList<String> stringList = new ArrayList<String>();

  public static void main(String[] args) {
    ArrayListOpg main = new ArrayListOpg();

    main.go();
  }

  public void go(){
    testString1 = "test";
    stringList.add(testString1);

    System.out.println(doesContainSting(stringList, testString1));
  }

  public boolean doesContainSting(ArrayList stringList, String testString1){

    if(stringList.contains("test")){
      System.out.println("The string has been found");
      return true;
    }
    else
      stringList.add(testString1);
    System.out.println(stringList);

      return false;
  }
}
