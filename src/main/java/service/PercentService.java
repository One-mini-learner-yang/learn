package service;

import model.AAAA;

import java.util.Objects;

public class PercentService {
    public static AAAA aaa=new AAAA();
    public boolean openOrClose(Integer ozId){

        if(!aaa.getBlackBlanket().contains(ozId)&&(aaa.getWhiteBlanket().contains(ozId)||ozId%100<aaa.getPercent())){
            return true;
        }else {
            return false;
        }
    }
}
