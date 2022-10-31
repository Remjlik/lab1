import javafx.stage.Stage;

public class Controller {
    private final Stage primaryStage;

    private final Card_insert card_insert = new Card_insert();
    private final Language_choice language_choice = new Language_choice();
    private final Pincode_insert pincode_insert = new Pincode_insert();
    private final Interaction_user interaction_user = new Interaction_user();
    private final Interaction_tech_supp interaction_tech_supp = new Interaction_tech_supp();
    private final Cash_withdrawal cash_withdrawal = new Cash_withdrawal();
    private final Money_transfer money_transfer = new Money_transfer();
    private final Services services = new Services();
    private final View_bill view_bill = new View_bill();
    private Card card = new Card(1111, 42558003 );
    private final Return_card return_card = new Return_card();
    private final Fill_money fill_money = new Fill_money();
    private final Fill_paper fill_paper = new Fill_paper();
    private final ResetPin reset_pin = new ResetPin();

    private final Print_cheque cheque = new Print_cheque();
    private String lang;

    public Controller(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public Stage getStage(){
        return this.primaryStage;
    }

    public void startWindow(){
        language_choice.createUI(this);
    }


    public  void language_choice(String lang){
            pincode_insert.createUI(this);
            this.lang = lang;
        }

    public void card_insert(Card card){
        card_insert.createUI(this);
    }

    public boolean pincode_insert(int pin){
        interaction_user.createUI(this);
        return true;
    }

    public void interaction_user(){
        interaction_user.createUI(this);
    }

    public void interaction_tech_supp(){
        interaction_tech_supp.createUI(this);
    }

    public Bill view_bill(){
        view_bill.createUI(this, lang);
        return this.card.getBill();
    }

    public void view_bill2(double amount){
        this.card.money_transfer(amount);
    }


    public boolean cash_withdrawal(double amount){

        cash_withdrawal.createUI(this, lang);
        return true;
    }

    public void cheque_printing(){
        cheque.createUI(this, lang, cash_withdrawal.temp );
    }

    public void cash_withdrawal2(double amount){

        this.card.money_transfer(amount);
    }

    public boolean money_transfer(int receiverCardNumber, double amount){
        money_transfer.createUI(this, lang);
        return true;
    }

    public void money_transfer2(double amount){
        this.card.money_transfer(amount);
    }


    public boolean services(String providerName, String accountNumber, String somethingName, double amount){
        services.createUI(this, lang);
        return true;
    }

    public void services2(double amount){
        this.card.money_transfer(amount);
    }

    public void return_card(){
        return_card.createUI(this);
    }

    public void reset_pin(){
        reset_pin.createUI(this);
    }


    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void fill_money(double amount){
        fill_money.createUI(this);
    }

    public void fill_paper(int amount){
        fill_paper.createUI(this);
    }
}
