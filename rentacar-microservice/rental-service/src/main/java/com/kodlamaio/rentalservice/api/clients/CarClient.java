package com.kodlamaio.rentalservice.api.clients;

import com.kodlamaio.commonpackage.utils.dto.ClientResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

@FeignClient(name="inventory-service",fallback = CarClientFallBack.class)
public interface CarClient {
    @GetMapping(value = "/api/cars/check-car-available/{carId}")
    ClientResponse checkIfCarAvailable(@PathVariable UUID carId);
}
