package main.service.discount;

import main.model.Discount;
import main.repository.discount.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SearchDiscountService {
    @Autowired
    DiscountRepository discountRepository;

    public Discount getDiscountById(UUID discountId) throws Exception {
        Discount discount = discountRepository.searchDiscountBy(discountId.toString());
        if (discount == null) {
            throw new Exception("Discount id not found");
        }
        return discount;
    }

    public List<Discount> getDiscountsOfProduct(UUID productId) {
        List<Discount> discounts = discountRepository.getDiscountsOf(productId.toString());
        return discounts;
    }
}