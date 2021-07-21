package model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class AAAA {
    List<Integer> whiteBlanket;
    List<Integer> blackBlanket;
    Integer percent=75;
    public AAAA(){
        whiteBlanket=new ArrayList<>();
        blackBlanket=new ArrayList<>();
        whiteBlanket.add(111);
        whiteBlanket.add(222);
        blackBlanket.add(333);
        blackBlanket.add(443);
    }
}
