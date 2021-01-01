package org.itstep.step02;

import org.itstep.step01.ObjectPair;
public class PairDriver {
    public static void main(String[] args) {
        Pair<String, Integer>[] stadiums = new Pair[3];
        stadiums[0] = new Pair<>((String)"Bridgeforth Stadium",25000);
        stadiums[1] = new Pair<>((String)"Michigan Stadium", 109901);
        stadiums[2] = new Pair<>((String)"Lane Stadium", 66233);



        System.out.println(largestStadium(stadiums));
    }
    public static String largestStadium(Pair<String, Integer>[] stadiums) {
        int idx=0;
        int max = stadiums[0].getSecond();

        for (int i = 1; i < stadiums.length; i++) {
            if(stadiums[i].getSecond()>max){
                idx=i;
                max=stadiums[i].getSecond();
            }
        }
        return stadiums[idx].getFirst();
    }
    }



/*
бонусный вопрос не будет кампелироваться код из-за несовместимости типов.Т.к обобщенные классы
позволяют сохранить строгую типизацию
Бонусный вопрос:Из-за обнаружения проблем на этапе кклмпиляции, из-за строгой типизации

 */