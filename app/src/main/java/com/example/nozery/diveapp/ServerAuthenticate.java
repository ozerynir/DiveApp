package com.example.nozery.diveapp;

/**
 * Created by nozery on 7/18/2015.
 */
public interface ServerAuthenticate {
    String userSignUp(final String name, final String email, final String pass, String authType)
            throws Exception;
    String userSignIn(final String user, final String pass, String authType) throws Exception;
}
