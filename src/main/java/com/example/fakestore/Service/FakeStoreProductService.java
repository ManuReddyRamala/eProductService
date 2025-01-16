package com.example.fakestore.Service;

import com.example.fakestore.Dtos.FakeStoreResonseDto;
import com.example.fakestore.Model.Category;
import com.example.fakestore.Model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class FakeStoreProductService implements  ProductService{

    private RestTemplate  restTemplate;

    FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Override
    public Product getProduct(long id) {
        FakeStoreResonseDto fdto=restTemplate.getForObject("http://fakestore/products/" + id,
                FakeStoreResonseDto.class);
        if(fdto==null)
            return null;
        else
        {
            Product p=ConvertFakeStoreDtoToProduct(fdto);
            return p;
        }

    }
    public Product ConvertFakeStoreDtoToProduct(FakeStoreResonseDto fdto) {
        Product product = new Product();
        product.setId(fdto.getId());
        product.setDescription(fdto.getDescription());
        product.setTitle(fdto.getTitle());
        product.setPrice(fdto.getPrice());
        Category c= new Category();
        c.setTitle(fdto.getCategory());
        product.setImage(fdto.getImage());
        return product;

    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }
}
