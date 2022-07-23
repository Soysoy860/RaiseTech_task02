public class Book {

    private String name;//ここではカテゴリ名とする
    private int price;
    private int publish;

    //コンストラクタで名前、値段、出版年をセット
    public Book(String name, int price, int publish) {
        this.name = name;
        this.price = price;
        this.publish = publish;
    }

    //getterとsetter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "名前:" + this.name + " 値段:" + this.price + "円" + " 出版年:" + this.publish;
    }

}
