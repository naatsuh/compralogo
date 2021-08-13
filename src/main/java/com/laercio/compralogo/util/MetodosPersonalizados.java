package com.laercio.compralogo.util;

public class MetodosPersonalizados {

    public String dataBr (String data, String separador){
        String []dataBr = data.split("-");
        String resultDataBr = dataBr[2] + separador + dataBr[1] + separador + dataBr[0];
        return resultDataBr;
    }
}
