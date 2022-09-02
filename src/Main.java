import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        List<Book> arrayList = Arrays.asList(new Book("Harry 1", "Messi", 654654654L, 500),
                new Book("Harry 2", "Eriksen", 6546545554L, 5050),
                new Book("Harry 4", "Benzema", 6546545554L, 650),
                new Book("Harry 3", "K Rowling", 6546545554L, 58),
                new Book("Harry 10", "EIGHT", 6546545554L, 5040),
                new Book("Harry 5", "J", 6546545554L, 5050)
        );

        for (Book book : arrayList) {
            System.out.print(book);
        }
        System.out.println();

        System.out.println("sorting author names using comparator\n");
        Collections.sort(arrayList, new authorComparator());
        for (Book book : arrayList) {
            System.out.print(book);
        }
        System.out.println("\nsorting author names using comparator\n");
        Collections.sort(arrayList, new priceComparator());
        for (Book book : arrayList) {
            System.out.print(book);
        }


//        for (int i = 0; i < arrayList.size(); i++) {
//            for (int j = 0; j < arrayList.size() - 1 - i; j++) {
//                if (arrayList.get(j).getPrice() > arrayList.get(j + 1).getPrice()) {
//                    Book temp = arrayList.get(j);
//                    arrayList.set(j, arrayList.get(j + 1));
//                    arrayList.set(j + 1, temp);
//                }
//            }
//        }
//        System.out.println(arrayList.toString());
    }
}
