package com.example.controllers;

import com.example.exception.DeviceNotFoundException;
import com.example.model.Device;
import com.example.storage.DefaultDeviceStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@Controller
public class DeviceController {

    @Autowired
    private DefaultDeviceStorage deviceStorage;

    @GetMapping("/devices")
    @ResponseBody
    public List<Device> getAllDevices() {

        return deviceStorage.getDevices();
    }

    @GetMapping("/devices/{id}")
    @ResponseBody
    public Device getDeviceById(@PathVariable("id") Integer id) throws DeviceNotFoundException {

        Optional<Device> device = deviceStorage.findById(id);
        if (device.isPresent()) {
            return device.get();
        } else {
            throw new DeviceNotFoundException();
        }
    }

    @PostMapping("/devices")
    @ResponseStatus(HttpStatus.OK)
    public void addDevice(@RequestBody Device device) {

        deviceStorage.addDevice(device);
    }

    @DeleteMapping("/devices/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void addDevice(@PathVariable("id") Integer id) throws DeviceNotFoundException {

        Optional<Device> device = deviceStorage.findById(id);
        if (device.isPresent()) {
            deviceStorage.deleteDevice(device.get());
        } else {
            throw new DeviceNotFoundException();
        }
    }

    @ExceptionHandler(DeviceNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ResponseBody
    public void handleException(DeviceNotFoundException e) {
    }
}
