public class Book {
    //attributes
    String title;
    int yearOfPublishing;
    long isbnNumber;
    String authorName;

    Book(){
        title = "Book1";
        authorName = "author1";
        yearOfPublishing = 2010;
        isbnNumber = 1234567890123L;
    }


    /*public static void main(String[] args) {
        Book obj = new Book();
        System.out.println("obj.title = " + obj.title);
        System.out.println("obj.authorName = " + obj.authorName);
        System.out.println("obj.yearOfPublishing = " + obj.yearOfPublishing);
        System.out.println("obj.isbnNumber = " + obj.isbnNumber);

        obj.title = "complete Reference 12th Edition";
        obj.authorName = "Herbert Scihildth";
        obj.yearOfPublishing = 2021;
        obj.isbnNumber = 1234567890000L;

        System.out.println("obj.title = " + obj.title);
        System.out.println("obj.authorName = " + obj.authorName);
        System.out.println("obj.yearOfPublishing = " + obj.yearOfPublishing);
        System.out.println("obj.isbnNumber = " + obj.isbnNumber);
    }
    */

}
