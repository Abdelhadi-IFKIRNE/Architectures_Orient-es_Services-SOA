package org.example.service;

import org.example.apsects.Log;
import org.example.apsects.SecuredByAspect;

public class metierImpl implements metier {
    @Override
    @Log
    @SecuredByAspect(roles={"ADMIN","USER"})
    public String getInformation(String message, int number) {
        return message+ " : "+number;
    }
}
