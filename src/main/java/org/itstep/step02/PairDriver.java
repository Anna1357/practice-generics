package org.itstep.step02;

import org.itstep.step01.ObjectPair;
public class PairDriver {
    public static void main(String[] args) {
        Pair[] stadiums = new Pair[3];
        stadiums[0] = new Pair((String)"Bridgeforth Stadium",(int) 25000);
        stadiums[1] = new Pair((String)"Michigan Stadium",(int) 109901);
        stadiums[2] = new Pair((String)"Lane Stadium",(double) 66.233);



        System.out.println(largestStadium(stadiums));
    }
    public static String largestStadium(Pair[] stadiums) {
        Pair largest = stadiums[0];
        for (int i = 0; i < stadiums.length; i++) {
            if(Double.valueOf(stadiums[i].getSecond().toString())>Double.valueOf(largest.getSecond().toString())){
                largest=stadiums[i];
            }
        }
        return largest.getFirst().toString();
    }

}

/*
Бонусный вопрос: Не скомпилируется, там стояла "," , а нужна "."

 */