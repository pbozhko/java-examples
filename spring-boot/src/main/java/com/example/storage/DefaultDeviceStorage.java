package com.example.storage;

import com.example.model.Device;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DefaultDeviceStorage implements DeviceStorage {

    private List<Device> devices = new ArrayList<>();

    @Override
    public List<Device> getDevices() {
        return devices;
    }

    @Override
    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    @Override
    public void addDevice(Device device) {
        this.devices.add(device);
    }

    @Override
    public void deleteDevice(Device device) {
        this.devices.remove(device);
    }

    @Override
    public Optional<Device> findById(Integer id) {
        return devices
            .stream()
            .filter(device -> device.getId().equals(id))
            .findFirst();
    }
}
