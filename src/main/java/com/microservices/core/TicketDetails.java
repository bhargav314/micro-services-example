package com.microservices.core;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class TicketDetails {
    @JsonProperty(value = "Ticket ID")
    private Long id;

    @JsonProperty(value = "Ticket Holder Name")
    private String useName;

    @JsonProperty(value = "Ticket Status")
    private String status;

    @JsonProperty(value = "Ground Name")
    private String groundName;

    @JsonProperty(value = "Match Date")
    private Date matchDate;

    @JsonProperty(value = "Date of Booking")
    private Date dateOfBooking;

    @JsonProperty(value = "Ticket Booked By")
    private String tickedBookedUserName;

    @JsonProperty(value = "Team A")
    private String teamA;

    @JsonProperty(value = "Team B")
    private String teamB;

    @JsonProperty(value = "Cost")
    private Long cost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGroundName() {
        return groundName;
    }

    public void setGroundName(String groundName) {
        this.groundName = groundName;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public Date getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(Date dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public String getTickedBookedUserName() {
        return tickedBookedUserName;
    }

    public void setTickedBookedUserName(String tickedBookedUserName) {
        this.tickedBookedUserName = tickedBookedUserName;
    }

    public String getTeamA() {
        return teamA;
    }

    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "TicketDetails{" +
                "id=" + id +
                ", useName='" + useName + '\'' +
                ", status='" + status + '\'' +
                ", groundName='" + groundName + '\'' +
                ", matchDate=" + matchDate +
                ", dateOfBooking=" + dateOfBooking +
                ", tickedBookedUserName='" + tickedBookedUserName + '\'' +
                ", teamA='" + teamA + '\'' +
                ", teamB='" + teamB + '\'' +
                ", cost=" + cost +
                '}';
    }
}
