package me.superischroma.fx.service;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class FXServiceHandler
{
    @Getter
    private List<FXService> services;

    public FXServiceHandler()
    {
        services = new ArrayList<>();
    }

    public void add(FXService service)
    {
        services.add(service);
        service.start();
    }

    public int getServiceAmount()
    {
        return services.size();
    }
}