package BogOpg;

import java.util.ArrayList;

public class Bibliotek {
  private ArrayList<Bog> bogListe = new ArrayList<>();

  public static void main(String[] args) {
    Bibliotek main = new Bibliotek();
    main.go();
  }

  public void go(){
    createBog();

    System.out.println(checkBog(bogListe.get(0)));

  }

  public void createBog(){
    Bog bog1 = new Bog();
    bog1.setISNB(3456);
    bog1.setTitel("The Test");
    bog1.setUdgivelsesÅr(2003);

    Bog bog2 = new Bog();
    bog2.setISNB(3444);
    bog2.setTitel("The Great Test");
    bog2.setUdgivelsesÅr(2005);

    Bog bog3 = new Bog();
    bog3.setISNB(4444);
    bog3.setTitel("Strange times");
    bog3.setUdgivelsesÅr(2001);

    bogListe.add(bog1);
    bogListe.add(bog2);
    bogListe.add(bog3);
  }

  public boolean checkBog(Bog b1){
    for(Bog b: bogListe){
      if (b1.getISNB() == b.getISNB()){
        return true;
      }

      else return false;
    }
    return false;
  }


}
