package com.disebud;

import java.util.ArrayList;

public class FindTest {

    public void findFloor(int jlhFloor , int noLoker) {

        int start = 0 , finish = 0, plus =  0;

//        int inputan = 10;


        boolean plusFive = true, plusSix = true, plusSeven = true ;

//            Map<Integer,String> map=new HashMap<Integer,String>();

        ArrayList<String> deretRange = new ArrayList<String>();

        for (int floor = 1 ; floor <= jlhFloor ; floor++ ){
//                System.out.println("Floor = " + floor);
            if(plusFive){
                plus = 5;
                start = finish + 1;
                finish = finish + plus;
//                    map.put(floor,start+"-"+finish);
                deretRange.add(start+"-"+finish);
                plusFive = false;
                plusSix = true;
                plusSeven = true;
            }else if(plusSix){
                plus = 6;
                start = finish + 1;
                finish = finish + plus;
//                    map.put(floor,start+"-"+finish);
                deretRange.add(start+"-"+finish);
                plusSix = false;
                plusSeven = true;
            }else if(plusSeven){
                plus = 7;
                start = finish + 1;
                finish = finish + plus;
//                    map.put(floor,start+"-"+finish);
                deretRange.add(start+"-"+finish);
                plusSeven = false;
                plusFive = true;
                plusSix = true;
            }



        }

        for (int i = 0; i < deretRange.size(); i++){
//            System.out.println("Floor - " + (i+1) + " : " + deretRange.get(i));
            String[] valueRange = deretRange.get(i).split("-");
            int rangeAwal = Integer.valueOf(valueRange[0]);
            int rangeAkhir = Integer.valueOf(valueRange[1]);

            for( int idx = rangeAwal ; idx <= rangeAkhir; idx++ ){
                if(noLoker == idx){
                    System.out.println("==========================================");
                    System.out.println("No Loker " + noLoker + " On Floor : " + (i + 1) + " = Range No Loker : " + deretRange.get(i));
                }
            }

        }


    }
}
