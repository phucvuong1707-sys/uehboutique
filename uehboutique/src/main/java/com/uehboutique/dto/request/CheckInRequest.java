package com.uehboutique.dto.request;

import java.time.LocalDate;

public class CheckInRequest {
    private Integer guestId;
    private Integer roomId;
    private Integer staffId;
    private LocalDate checkOutDate;

    // --- Getters ---
    public Integer getGuestId() { return guestId; }
    public Integer getRoomId() { return roomId; }
    public Integer getStaffId() { return staffId; }
    public LocalDate getCheckOutDate() { return checkOutDate; }

    // --- Setters ---
    public void setGuestId(Integer guestId) { this.guestId = guestId; }
    public void setRoomId(Integer roomId) { this.roomId = roomId; }
    public void setStaffId(Integer staffId) { this.staffId = staffId; }
    public void setCheckOutDate(LocalDate checkOutDate) { this.checkOutDate = checkOutDate; }
}