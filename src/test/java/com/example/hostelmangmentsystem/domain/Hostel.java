package com.example.hostelmangmentsystem.domain;

import lombok.Data;

import java.util.List;

@Data
public class Hostel {

    private HostelName hostelName;

    private Gender type;

    private List<Room> rooms;

}
