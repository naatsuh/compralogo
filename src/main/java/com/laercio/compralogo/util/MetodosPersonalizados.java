package com.laercio.compralogo.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MetodosPersonalizados {

    public String dataBr (String data, String separador){
        String []dataBr = data.split("-");
        String resultDataBr = dataBr[2] + separador + dataBr[1] + separador + dataBr[0];
        return resultDataBr;

    }

    public String dataDeAgora (){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");

        String data = simpleDateFormat.format(calendar.getTime());

        String []dataBr = data.split("-");
        String resultDataBr = dataBr[0] + "-" + dataBr[1] + "-" + dataBr[2];
        return resultDataBr;

    }
}
