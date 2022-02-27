package com.example.tnpharmacy.Controllor;

import android.text.Editable;
import android.text.TextUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loginvalidate {
private String Email,password ;

    public Loginvalidate() {

    }

    public Loginvalidate(Editable text, Editable text1) {
    }


    public boolean Emailvalidate(String email ) {
        if (email.length()>7 && Email.indexOf("@")>0)
        {
           return true;
        }
        else
        {
           return false;
        }
    }
}
