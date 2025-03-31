package com.thinkonstructive.rest_demo.service;

import com.thinkonstructive.rest_demo.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendorDetails(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendorDetails();

    List<CloudVendor> getAllCloudVendors();
}
