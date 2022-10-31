import javafx.scene.control.Alert;

public class Card {

    private  int pincode;
    private  int number;
    private  Bill bill;

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public Card(int pincode, int number) {
        this.pincode = pincode;
        this.number = number;
        this.bill = new Bill(900);
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean money_transfer(double amount) {
        if(bill.getSum()-amount >= 0){
            this.bill.setSum(bill.getSum()-amount);
            return true;
        }
        else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Not enough money");
            alert.showAndWait();
            return false;
        }
    }
}
