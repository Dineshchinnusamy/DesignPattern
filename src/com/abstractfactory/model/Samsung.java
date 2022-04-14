package com.abstractfactory.model;

import com.abstractfactory.interfaces.Device;

public class Samsung implements Device {
    String ramsize;
    String processor;

    public Samsung(String ramsize, String processor) {
        this.ramsize = ramsize;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "ramsize='" + ramsize + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }

    public String specification(){
        return "Samsung{" +
                "ramsize='" +this.ramsize + '\'' +
                ", processor='" + this.processor + '\'' +
                '}';
    }
}
