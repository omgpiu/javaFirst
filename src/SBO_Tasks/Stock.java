package SBO_Tasks;

public class Stock {
    String name;
    String symbol;
    double previousClosingPrice;
    double currentPrice;

    double getChangePercent(){
        return ((currentPrice-previousClosingPrice)*100)/currentPrice;
    }

    Stock(String newName,String currency,double prevPrice,double newCurrentPrice){
        name= newName;
        symbol = currency;
        previousClosingPrice = prevPrice;
        currentPrice = newCurrentPrice;

    }


}
