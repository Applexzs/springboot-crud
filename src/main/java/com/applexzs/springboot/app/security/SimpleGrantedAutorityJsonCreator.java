package com.applexzs.springboot.app.security;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class SimpleGrantedAutorityJsonCreator {

    public SimpleGrantedAutorityJsonCreator(@JsonProperty("authority") String role){}

}
