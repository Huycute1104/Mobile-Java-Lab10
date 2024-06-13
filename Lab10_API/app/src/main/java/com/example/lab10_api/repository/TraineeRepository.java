package com.example.lab10_api.repository;

import com.example.lab10_api.api.APIClient;
import com.example.lab10_api.service.TraineeService;

public class TraineeRepository {
    public static TraineeService getTraineeService() {
        return APIClient.getClient().create(TraineeService.class);
    }
}
