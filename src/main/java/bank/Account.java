package bank;

public class Account {


  //create fields or properties
  private int id;
  private String type;
  private double balance;

  //create a constructor
  public Account(int id, String type, double balance) {
    this.id = id;
    this.type = type;
    this.balance = balance;
  }

  // create getters and setters
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  public double getBalance() {
    return balance;
  }
  public void setBalance(double balance) {
    this.balance = balance;
  }

  
  

  
}
