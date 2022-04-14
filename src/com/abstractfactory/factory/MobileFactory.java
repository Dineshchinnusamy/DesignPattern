package com.abstractfactory.factory;

import com.abstractfactory.factory.DeviceType;
import com.abstractfactory.interfaces.AbstractDeviceFactory;
import com.abstractfactory.interfaces.Device;
import com.abstractfactory.model.Oneplus;
import com.abstractfactory.model.Samsung;

public class MobileFactory implements AbstractDeviceFactory {
    public Device getGadget(DeviceType deviceType) {
        switch (deviceType) {
            case Oneplus:
                return new Oneplus("8", "snapdragon");
            case Samsung:
                return new Samsung("10", "qualcom");
        }
        return null;
    }

}
