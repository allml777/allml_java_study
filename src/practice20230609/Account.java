package practice20230609;

public class Account {
    private String userName;
    private String cardId;
    private String passWord;
    private Double money;

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    private Double quotaMoney;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Double getQuotaMoney() {
        return quotaMoney;
    }

    public void setQuotaMoney(Double quotaMoney) {
        this.quotaMoney = quotaMoney;
    }
}
