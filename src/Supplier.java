import java.util.ArrayList;
import java.util.List;

public class Supplier {
    public List<Window> take_windows(){
        ArrayList<Window> windowList = new ArrayList<>();
        Window language_choice = new Language_choice();
        Window card_insert = new Card_insert();
        Window pincode_insert = new Pincode_insert();
        Window view_bill = new View_bill();
        Window cash_withdrawal = new Cash_withdrawal();
        Window money_transfer = new Money_transfer();
        Window services = new Services();
        Window return_card = new Return_card();
        Window fill_money = new Fill_money();
        Window fill_paper = new Fill_paper();



        windowList.add(language_choice);
        windowList.add(card_insert);
        windowList.add(pincode_insert);
        windowList.add(view_bill);
        windowList.add(card_insert);
        windowList.add(cash_withdrawal);
        windowList.add(money_transfer);
        windowList.add(services);
        windowList.add(return_card);
        windowList.add(fill_money);
        windowList.add(fill_paper);



        return windowList;
    }
}
