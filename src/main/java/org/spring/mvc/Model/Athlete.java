package org.spring.mvc.Model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.validation.constraints.*;
import java.util.Arrays;
import java.util.Date;


@Component
public class Athlete {

//    @NotNull(message="This is a required field")
    @Size(min=1,message=" Warning : Mandatory Field (@Size)")
//    @NotEmpty(message=" Warning : Mandatory Field { @NotEmpty }")
    private String name;

    private String country;

    @NotNull(message="This is a required field")
    private String rank; //A,B,C,D

    @NotNull(message = "mandatory field")
    @Min(value = 1,message = "Min designation value must be >=1")
    @Max(value = 10,message = "Designation value must be <=10")
    private int designation;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Past(message = "Date must be in Past.")
    private Date dob;

    private String[] tournaments;

    public Athlete() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getDesignation() {
        return designation;
    }

    public void setDesignation(int designation) {
        this.designation = designation;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String[] getTournaments() {
        return tournaments;
    }

    public void setTournaments(String[] tournaments) {
        this.tournaments = tournaments;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", rank='" + rank + '\'' +
                ", designation=" + designation +
                ", date=" + dob +
                ", tournaments=" + Arrays.toString(tournaments) +
                '}';
    }
}
