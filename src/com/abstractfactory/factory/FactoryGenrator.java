package com.abstractfactory.factory;

import com.abstractfactory.interfaces.AbstractDeviceFactory;

public class FactoryGenrator {
    public static AbstractDeviceFactory getFactory(FactoryType factoryType) {
        switch (factoryType) {
            case LaptopFactory:
                return new LaptopFactory();
            case MobileFactory:
                return new MobileFactory();
        }
        return null;
    }
}
