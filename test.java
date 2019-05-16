package gmusic;

public class test{

public static void main(String args[]) throws Exception{
    int res = new DBase().insert("INSERT INTO `ticket_types` (`ticket_type_ID`, `ticket_type`, `ticket_price`, `concert_ID`) VALUES (2, `elite`, 100, NULL);");
}
    
}