package com.example.storage;

import com.example.model.Device;

import java.util.List;
import java.util.Optional;

public interface DeviceStorage {

    List<Device> getDevices();

    void setDevices(List<Device> devices);

    void addDevice(Device device);

    void deleteDevice(Device device);

    Optional<Device> findById(Integer id);
}
