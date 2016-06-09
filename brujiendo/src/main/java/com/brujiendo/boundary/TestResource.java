/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brujiendo.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Daniel
 */
@Path("test")
public class TestResource {

    @GET
    public String test() {
        return "hey";
    }
}
