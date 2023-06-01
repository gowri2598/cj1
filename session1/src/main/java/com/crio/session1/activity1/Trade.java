
package com.crio.session1.activity1;

public class Trade {
  
  public String symbol;
  public String quantity;
  public String purchaseDate;
  
  public Trade() {
  }
  
  public Trade(String symbol, String quantity, String purchaseDate) {
    this.symbol = symbol;
    this.quantity = quantity;
    this.purchaseDate = purchaseDate;
  }

  @Override
  public String toString() {
    return "Trade [purchaseDate=" + purchaseDate + ", quantity=" + quantity + ", symbol=" + symbol + "]";
  }
}
