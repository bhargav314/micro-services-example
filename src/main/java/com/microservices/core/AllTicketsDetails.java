package com.microservices.core;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class AllTicketsDetails {
    @JsonProperty(value = "Booked User Id")
    Long userId;
    @JsonProperty(value = "All Tickets Info")
    private List<TicketDetails> listOfAllTickets = new ArrayList<>();

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<TicketDetails> getListOfAllTickets() {
        return listOfAllTickets;
    }

    public void setListOfAllTickets(List<TicketDetails> listOfAllTickets) {
        this.listOfAllTickets = listOfAllTickets;
    }

    @Override
    public String toString() {
        return "AllTicketsDetails{" +
                "userId=" + userId +
                ", listOfAllTickets=" + listOfAllTickets +
                '}';
    }
}
