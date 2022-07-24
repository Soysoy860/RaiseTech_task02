//RaiseTech2回目課題

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //コレクション生成
        List<Book> books = new ArrayList<>();
        books.add(new Book("辞書", 10000, 2020));
        books.add(new Book("漫画", 800, 2022));
        books.add(new Book("雑誌", 600, 2018));

        //コレクションbooksの各要素の名前（カテゴリ）だけをすべて出力
        for (Book book : books) {
            System.out.println(book.getCategory());
        }

        //2020年以降に出版された本のみインスタンスをそのまま出力
        for (Book book : books) {
            if (book.getPublish() >= 2020) {
                System.out.println(book);
            }
        }

        //Streamを使って2020年以降出版した本だけ出力
        List<Book> booksAfter2020 = books.stream().filter(book -> book.getPublish() >= 2020)
                .collect(Collectors.toList());
        System.out.println(booksAfter2020);


    }
}
