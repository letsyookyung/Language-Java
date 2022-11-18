
class main {
    public static void main(String[] args) {
        // type of object /
        User youngerUser = new User("yookyung", "1993-08-30");
        User olderUser = new User("ron", "1945-08-30");
        Book bbongbbong = new Book("bbongbbong", "world", 100);
        AudioBook dracular = new AudioBook("dracular", "company", 30000);
        Ebook jeeves = new Ebook("Carry on jevves", "nexters", 280, "PDF");
        System.out.printf("- %s was born back in %s and he is now %d years old.\n", youngerUser.getName(),
                youngerUser.getBirthDay(), youngerUser.age());

        youngerUser.borrow(bbongbbong);
        System.out.printf("%s has borrowed these books: %s\n",youngerUser.getName(), youngerUser.borrowedBooks());
        youngerUser.borrow(dracular);
        System.out.printf("%s has borrowed these books: %s by %s.\n",olderUser.getName(), dracular.getTitle(), dracular.getAuthor() );
        System.out.printf("%s has borrowed these books: %s.\n",olderUser.getName(), jeeves.toString());


    }
}
