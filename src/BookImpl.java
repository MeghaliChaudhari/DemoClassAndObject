public class BookImpl {
    public static void main(String[] args) {
        Book object = new Book();
        Book object1 = new Book();

        System.out.println("object.authorName = " + object.authorName);
        System.out.println("object.title = " + object.title);
        System.out.println("object.yearOfPublishing = " + object.yearOfPublishing);
        System.out.println("object.isbnNumber = " + object.isbnNumber);

        System.out.println("Details of object1");
        System.out.println("object1.authorName = " + object1.authorName);
        System.out.println("object1.title = " + object1.title);
        System.out.println("object1.yearOfPublishing = " + object1.yearOfPublishing);
        System.out.println("object1.isbnNumber = " + object1.isbnNumber);
        
        object1.yearOfPublishing = 2003;
        System.out.println("object1.yearOfPublishing = " + object1.yearOfPublishing);

    }
}
