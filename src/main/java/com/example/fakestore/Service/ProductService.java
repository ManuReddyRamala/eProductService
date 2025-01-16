package com.example.fakestore.Service;

import com.example.fakestore.Model.Product;

public interface ProductService {
    Product getProduct(long id);

    Product updateProduct(Product product);
}
