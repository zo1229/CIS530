package com.bookclub.service.impl;

import com.bookclub.model.Book;
import com.bookclub.service.dao.BookDao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemBookDao implements BookDao {

    private List<Book> books;

    static {
        System.out.println("🔴 MemBookDao class loaded!");
    }

    public MemBookDao() {
        System.out.println("🔥🔥🔥 MEM BOOK DAO IS RUNNING 🔥🔥🔥");
        this.books = new ArrayList<>();

        this.books.add(new Book("978-0451524935", "1984",
                "Dystopian novel by George Orwell", 328, Arrays.asList("George Orwell")));
        this.books.add(new Book("978-0140449136", "The Odyssey",
                "Epic Greek poem attributed to Homer", 560, Arrays.asList("Homer")));
        this.books.add(new Book("978-0061120084", "To Kill a Mockingbird",
                "Classic novel by Harper Lee", 336, Arrays.asList("Harper Lee")));
        this.books.add(new Book("978-0553382563", "A Brief History of Time",
                "Science book by Stephen Hawking", 212, Arrays.asList("Stephen Hawking")));
        this.books.add(new Book("978-0307277671", "The Road",
                "Post-apocalyptic novel by Cormac McCarthy", 287, Arrays.asList("Cormac McCarthy")));

        System.out.println("✅ Books loaded into memory: " + this.books.size());
    }

    @Override
    public List<Book> list() {
        System.out.println("📚 Returning books list of size: " + this.books.size());
        return this.books;
    }

    @Override
    public Book find(String isbn) {
        for (Book book : this.books) {
            if (book.getIsbn().equalsIgnoreCase(isbn)) {
                System.out.println("🔍 Found book with ISBN: " + isbn);
                return book;
            }
        }
        System.out.println("❌ Book not found with ISBN: " + isbn);
        return null;
    }
}
