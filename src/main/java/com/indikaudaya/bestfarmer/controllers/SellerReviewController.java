package com.indikaudaya.bestfarmer.controllers;

import com.indikaudaya.bestfarmer.entities.Delivery;
import com.indikaudaya.bestfarmer.entities.SellerReview;
import com.indikaudaya.bestfarmer.services.DeliveryService;
import com.indikaudaya.bestfarmer.services.SellerReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/seller-review")
public class SellerReviewController {
    @Autowired
    private SellerReviewService sellerReviewService;

    @GetMapping
    public List<SellerReview> getAllSellerReviews() {
        return sellerReviewService.getAllSellerReview();
    }

    @GetMapping("/{id}")
    public SellerReview getSellerReviewById(@PathVariable Long id) {
        return sellerReviewService.getSellerReviewById(id);
    }

    @PostMapping
    public SellerReview saveSellerReview(@RequestBody SellerReview sellerReview) {
        return sellerReviewService.saveSellerReview(sellerReview);
    }

    @DeleteMapping("/{id}")
    public void deleteSellerReview(@PathVariable Long id) {
        sellerReviewService.deleteSellerReview(id);
    }
}
