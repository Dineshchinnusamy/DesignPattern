package com.abstractfactory.model;

import com.abstractfactory.interfaces.Device;

public class Hp implements Device {
    String ramsize;
    String processor;
    String gpu;

    public Hp(String ramsize, String processor,String gpu) {
        this.ramsize = ramsize;
        this.processor = processor;
        this.gpu = gpu ;
    }

    @Override
    public String toString() {
        return "Dell{" +
                "ramsize='" + ramsize + '\'' +
                ", processor='" + processor + '\'' +
                ", gpu='" + gpu + '\''+'}';
    }

    public String specification(){
        return "Dell{" +
                "ramsize='" +this.ramsize + '\'' +
                ", processor='" + this.processor + '\'' +
                ", gpu='" + gpu +
                '}';
    }
}
