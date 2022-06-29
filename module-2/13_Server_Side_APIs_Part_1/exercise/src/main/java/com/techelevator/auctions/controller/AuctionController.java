package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDao dao;

    public AuctionController() {

        this.dao = new MemoryAuctionDao();
    }

//    @RequestMapping(path = "", method = RequestMethod.GET)
//    public List<Auction> list(){
//       return dao.list();
//
//    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id){
        return dao.get(id);
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public Auction create(@RequestBody Auction auctionToPost){

        Auction postedAuction = dao.create(auctionToPost);
        return  postedAuction;

    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Auction> list(@RequestParam(required = false, defaultValue = "") String title_like,
                              @RequestParam(required = false, defaultValue = "0") double currentBid_lte) {
        List<Auction> auctions = new ArrayList<>();
        if(!title_like.equals("") && currentBid_lte > 0){
            auctions =  dao.searchByTitleAndPrice(title_like, currentBid_lte);
        }
        else if(currentBid_lte >0 ){
            auctions = dao.searchByPrice(currentBid_lte);
        }
        else if (!title_like.equals("")) {
            auctions = dao.searchByTitle(title_like);

        }
        else{
            auctions = dao.list();
        }
        return auctions;


    }



    }
