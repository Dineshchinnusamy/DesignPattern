package com.abstractfactory.interfaces;

import com.abstractfactory.factory.DeviceType;

public interface AbstractDeviceFactory {

    public Device getGadget(DeviceType deviceType);
}
