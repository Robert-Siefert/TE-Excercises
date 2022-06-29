package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDao dao;

    public AuctionController() {

        this.dao = new MemoryAuctionDao();
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Auction> list(){
       return dao.list();

    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id){
        return dao.get(id);
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public Auction create(Auction auctionToPost){

        try {
            Auction postedAuction = dao.create(auctionToPost);
            return  postedAuction;
        }
        catch (

        return null;
    }

}
