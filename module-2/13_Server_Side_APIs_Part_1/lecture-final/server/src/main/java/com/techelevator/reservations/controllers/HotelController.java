package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Hotel;
import com.techelevator.reservations.model.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HotelController {

    private HotelDao hotelDao;
    private ReservationDao reservationDao;

    public HotelController() {
        this.hotelDao = new MemoryHotelDao();
        this.reservationDao = new MemoryReservationDao(hotelDao);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list() {
        return hotelDao.list();
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
        return hotelDao.get(id);
    }

    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservations() {
        return reservationDao.findAll();
    }

    @RequestMapping(path = "/reservations/{id}", method = RequestMethod.GET)
    public Reservation getReservationByID (@PathVariable int id) {            // this is better than the one below...
        return reservationDao.get(id);
    }

    @RequestMapping(path = "/hotels/{id}/reservations", method = RequestMethod.GET)
    public List<Reservation> getReservationByHotelId (@PathVariable("id") int hotelID) {     // this is an example of renaming a path variable -- not common
        return reservationDao.findByHotel(hotelID);
    }

    @RequestMapping(path = "/reservations", method = RequestMethod.POST)
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationDao.create(reservation, reservation.getHotelID());
    }

    //hotels/filter?state=oh&city=cleveland
    @RequestMapping(path = "/hotels/filter", method = RequestMethod.GET)
    public List<Hotel> filterByStateAndCity(@RequestParam String state, @RequestParam(required = false) String city) {   //querystring params

        List<Hotel> filteredHotels = new ArrayList<>();
        List<Hotel> hotels = hotelDao.list();

        // return hotels that match state
        for (Hotel hotel : hotels) {

            // if city was passed we don't care about the state filter
            if (city != null) {
                if (hotel.getAddress().getCity().toLowerCase().equals(city.toLowerCase())) {
                    filteredHotels.add(hotel);
                }
            } else {
                if (hotel.getAddress().getState().toLowerCase().equals(state.toLowerCase())) {
                    filteredHotels.add(hotel);
                }

            }
        }

        return filteredHotels;
    }


//    @RequestMapping(path = "/reservations/{id}", method = RequestMethod.PUT)
//    public Reservation updateReservation(@RequestBody Reservation reservation, @PathVariable int id) {
//        //return reservationDao.update(reservation, reservation.getHotelID());  --> Replace with an update method from DAO
//    }

    //OR... better way

    //    @RequestMapping(path = "/reservations", method = RequestMethod.PUT)
//    public Reservation updateReservation(@RequestBody Reservation reservation) {
//        //return reservationDao.update(reservation);  --> Replace with an update method from DAO
//    }



}
