package com.abstractfactory.model;

import com.abstractfactory.interfaces.Device;

public class Oneplus implements Device {
    String ramsize;
    String processor;

    public Oneplus(String ramsize, String processor) {
        this.ramsize = ramsize;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "ONeplus{" +
                "ramsize='" + ramsize + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }

    public String specification(){
        return "Oneplus{" +
                "ramsize='" +this.ramsize + '\'' +
                ", processor='" + this.processor + '\'' +
                '}';
    }
}
