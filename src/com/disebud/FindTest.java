package com.disebud;

import java.util.ArrayList;

public class FindTest {

    public void findFloor(int noLoker) {

        int start = 0 , finish = 0, plus =  0;
        Boolean statusInfinity = false;
        boolean plusFive = true, plusSix = true, plusSeven = true ;
        ArrayList<String> deretRange = new ArrayList<String>();

        for (int floor = 1 ; floor >= 1 ; floor++ ){
            if(plusFive){
                plus = 5;
                start = finish + 1;
                finish = finish + plus;
                deretRange.add(start+"-"+finish);
                plusFive = false;
                plusSix = true;
                plusSeven = true;
            }else if(plusSix){
                plus = 6;
                start = finish + 1;
                finish = finish + plus;
                deretRange.add(start+"-"+finish);
                plusSix = false;
                plusSeven = true;
            }else if(plusSeven){
                plus = 7;
                start = finish + 1;
                finish = finish + plus;
                deretRange.add(start+"-"+finish);
                plusSeven = false;
                plusFive = true;
                plusSix = true;
            }

            for (int i = 0; i < deretRange.size(); i++){
                String[] valueRange = deretRange.get(i).split("-");
                int rangeAwal = Integer.valueOf(valueRange[0]);
                int rangeAkhir = Integer.valueOf(valueRange[1]);

                for( int idx = rangeAwal ; idx <= rangeAkhir; idx++ ){
                    if(noLoker == idx){
                        statusInfinity = true;
                        System.out.println("==========================================");
                        System.out.println("Number Loker " + noLoker + " On Floor : " + (i + 1) );
                        System.out.println("==========================================");

                        for (int id = 0; id < deretRange.size(); id++) {
                             System.out.println("Floor - " + (id+1) + " : range No " + deretRange.get(id));
                        }

                    }
                }
            }

            if (statusInfinity == true){
                break;
            }

        }


    }
}
