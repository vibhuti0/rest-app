package com.thinkonstructive.rest_demo.service.impl;

import com.thinkonstructive.rest_demo.model.CloudVendor;
import com.thinkonstructive.rest_demo.repository.CloudVendorRepository;
import com.thinkonstructive.rest_demo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImpl implements CloudVendorService {
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    CloudVendorRepository cloudVendorRepository;

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendorDetails(String cloudVendorId) {
       return cloudVendorRepository.findById(cloudVendorId).get();

    }

    @Override
    public List<CloudVendor> getAllCloudVendorDetails() {
        return cloudVendorRepository.findAll();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return List.of();
    }
}
