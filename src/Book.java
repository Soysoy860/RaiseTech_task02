public class Book {

    private String category;
    private int price;
    private int publish;

    //コンストラクタで名前、値段、出版年をセット
    public Book(String name, int price, int publish) {
        this.category = name;
        this.price = price;
        this.publish = publish;
    }

    //getterとsetter
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPublish() {
        return publish;
    }

    public void setPublish(int publish) {
        this.publish = publish;
    }
    //toStringをオーバーライド
    
    @Override
    public String toString() {
        return "名前:" + this.category + " 値段:" + this.price + "円" + " 出版年:" + this.publish;
    }

}
