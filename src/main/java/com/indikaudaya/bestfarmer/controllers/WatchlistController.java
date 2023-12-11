package com.indikaudaya.bestfarmer.controllers;

import com.indikaudaya.bestfarmer.entities.SellerReview;
import com.indikaudaya.bestfarmer.entities.Watchlist;
import com.indikaudaya.bestfarmer.services.SellerReviewService;
import com.indikaudaya.bestfarmer.services.WatchlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/watchlist")
public class WatchlistController {
    @Autowired
    private WatchlistService watchlistService;

    @GetMapping
    public List<Watchlist> getAllWatchlist() {
        return watchlistService.getAllWatchlist();
    }

    @GetMapping("/{id}")
    public Watchlist getWatchlistById(@PathVariable Long id) {
        return watchlistService.getWatchlistById(id);
    }

    @PostMapping
    public Watchlist saveWatchlist(@RequestBody Watchlist watchlist) {
        return watchlistService.saveWatchlist(watchlist);
    }

    @DeleteMapping("/{id}")
    public void deleteWatchlist(@PathVariable Long id) {
        watchlistService.deleteWatchlistUser(id);
    }
}
