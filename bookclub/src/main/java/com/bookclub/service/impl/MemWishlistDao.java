package main.java.com.bookclub.service.impl;

import com.bookclub.model.Book;
import com.bookclub.model.WishlistItem;
import com.bookclub.service.dao.WishlistDao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemWishlistDao implements WishlistDao {
    List<WishlistItem> wishlist;

    public MemWishlistDao() {
        this.wishlist = new ArrayList<WishlistItem>();
        this.wishlist.add(new WishlistItem("978-0451524935", "1984"));
        this.wishlist.add(new WishlistItem("978-0140449136", "The Odyssey"));
        this.wishlist.add(new WishlistItem("978-0061120084", "To Kill a Mockingbird"));
        this.wishlist.add(new WishlistItem("978-0553382563", "A Brief History of Time"));
    }

    @Override
    public List<WishlistItem> list() {
        return this.wishlist;
    }

    @Override
    public WishlistItem find(String key) {
        for (WishlistItem item : wishlist) {
            if (item.getIsbn().equals(key)) {
                return item;
            }
        }
        return new WishlistItem();
    }
}