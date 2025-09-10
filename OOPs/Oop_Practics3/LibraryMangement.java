package CoreJava.Oop_Practics3;

import CoreJava.OOP_practics2.Book;

public class LibraryMangement {
    static String libraryName="GLA Central library";
    String title;
    String author;
    final String isbn;

    static void displayLibraryName(){
        System.out.println(libraryName);
    }
    LibraryMangement(String title,String author,String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;

    }
    void display(){
        System.out.println(libraryName);
        System.out.println(title);
        System.out.println(author);
        System.out.println(isbn);

    }
}
class Libray{
    public static void main(String[] args) {
        LibraryMangement book=new LibraryMangement("oops","SK verma","yes");
        book.display();
    }
}