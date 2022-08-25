package BogOpg;

public class Bog {
  private int ISNB;
  private String titel;
  private int udgivelsesÅr;

  Bog(){

  }

  public void setISNB(int nummer){
    this.ISNB = nummer;
  }

  public void setTitel(String t){
    this.titel = t;
  }

  public void setUdgivelsesÅr(int u){
    this.udgivelsesÅr =u;
  }

  public int getISNB(){
    return ISNB;
  }

  public String getTitel(){
    return titel;
  }

  public int getUdgivelsesÅr(){
    return udgivelsesÅr;
  }

  @Override
  public String toString() {
    return "Bog{" +
        "ISNB=" + ISNB +
        ", titel='" + titel + '\'' +
        ", udgivelsesÅr=" + udgivelsesÅr +
        '}';
  }
}
