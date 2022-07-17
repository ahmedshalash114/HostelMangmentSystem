package com.example.hostelmangmentsystem.domain;

import lombok.Data;

import java.util.List;

@Data
public class Room {
    private List<BedSpace> bedSpaces;
}
