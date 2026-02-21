package com.nesar;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Cacheable
public class Laptop {
    @Id
    private int lid;
    private String laptopName;
    private String laptopModel;
    private String ram;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public String getLaptopModel() {
        return laptopModel;
    }

    public void setLaptopModel(String laptopModel) {
        this.laptopModel = laptopModel;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", laptopName='" + laptopName + '\'' +
                ", laptopModel='" + laptopModel + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
