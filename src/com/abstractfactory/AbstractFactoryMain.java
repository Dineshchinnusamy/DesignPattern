package com.abstractfactory;

import com.abstractfactory.factory.DeviceType;
import com.abstractfactory.factory.FactoryGenrator;
import com.abstractfactory.factory.FactoryType;
import com.abstractfactory.interfaces.Device;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        Device dell = FactoryGenrator.getFactory(FactoryType.LaptopFactory).getGadget(DeviceType.Dell);
        System.out.println(dell.specification());
        Device nokia = FactoryGenrator.getFactory(FactoryType.MobileFactory).getGadget((DeviceType.Samsung));
        System.out.println(nokia.specification());
    }
}
