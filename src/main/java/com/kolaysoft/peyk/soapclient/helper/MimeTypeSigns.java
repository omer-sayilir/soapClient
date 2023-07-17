package com.kolaysoft.peyk.soapclient.helper;

import java.util.HashMap;

public  class MimeTypeSigns {
    HashMap<String,String> signs;
    public HashMap<String, String> getMimeTypeSigns() {
        signs= new HashMap<>();

        // https://www.garykessler.net/library/file_sigs.html
        signs.put("25504446","pdf");

        signs.put("FFD8FFDB","jpeg");
        signs.put("FFD8FFE0","jpeg");
        signs.put("FFD8FFE1","jpeg");
        signs.put("FFD8FFE2","jpeg");
        signs.put("FFD8FFE8","jpeg");

        signs.put("49494D4D","tiff");

        signs.put("504B0304","tiff");
        signs.put("FDFFFFFF","tiff");


        return signs;
    }
}
