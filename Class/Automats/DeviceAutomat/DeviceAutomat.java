package Class.Automats.DeviceAutomat;

import Class.Automats.TradingAutomat;
import Class.Products.Devices.Device;

public abstract class DeviceAutomat<T extends Device> extends TradingAutomat<T> {

    protected DeviceAutomat() {

        super();

    }
    
}
