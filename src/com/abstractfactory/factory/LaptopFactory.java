package com.abstractfactory.factory;

import com.abstractfactory.interfaces.AbstractDeviceFactory;
import com.abstractfactory.interfaces.Device;
import com.abstractfactory.model.Dell;
import com.abstractfactory.model.Hp;

public class LaptopFactory implements AbstractDeviceFactory {
    public Device getGadget(DeviceType deviceType) {
        switch (deviceType) {
            case Hp:
                return new Hp("4", "1324", "gpu");
            case Dell:
                return new Dell("5", "3554", "gpu");
        }

        return null;
    }

}
