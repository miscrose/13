package com.example.tp13.entities;
import java.text.SimpleDateFormat;
import java.util.Date;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;


public class DateAdapter extends XmlAdapter<String, Date> {
    private final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    @Override
    public String marshal(Date v) throws Exception { return df.format(v); }
    @Override
    public Date unmarshal(String v) throws Exception { return df.parse(v); }


}
