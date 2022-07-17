package com.example.hostelmangmentsystem;

import com.example.hostelmangmentsystem.domain.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class HostelManagementSystemApplicationTests {

    List<Hostel> hostelList  = new ArrayList<>();

    @BeforeAll
    void initHostelManagement() {

        Hostel firstMaleHostel = new Hostel();

        prepareHostel(firstMaleHostel , Gender.MALE , "firstMaleHostel");

        Hostel secondMaleHostel = new Hostel();

        prepareHostel(secondMaleHostel , Gender.MALE , "secondMaleHostel");

        Hostel firstFemaleHostel = new Hostel();

        prepareHostel(firstFemaleHostel , Gender.FEMALE , "firstFemaleHostel");

        Hostel secondFemaleHostel = new Hostel();

        prepareHostel(secondFemaleHostel , Gender.FEMALE , "secondFemaleHostel");

    }

    private Hostel prepareHostel(Hostel hostel , Gender gender , String hostelName){

        HostelName hostelNameObject = new HostelName();

        hostelNameObject.setHostelName(hostelName);

        hostel.setHostelName(hostelNameObject);

        List<Room> rooms = new ArrayList<>(20);

        for (Room room: rooms) {
            room.setBedSpaces(new ArrayList<BedSpace>(4));
        }
        hostel.setRooms(rooms);
        hostel.setType(gender);
        return hostel;

    }



    @Test
    void sizeOfHostels(){
        System.out.println("shalash");
        System.out.println(hostelList.size());
        Assertions.assertEquals(hostelList.size() , 4);
    }



}
