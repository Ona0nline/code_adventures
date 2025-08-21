package org.connecting_ropes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class connecting_ropes {

    public static void main(String[] args) {

        System.out.println(trio_array(new ArrayList<>(List.of(4,3,2,6))));
        List<List<Integer>> trios = trio_array(new ArrayList<>(List.of(4,3,2,6)));
        List<List<Integer>> duos = duo_arrayWithFirstSum(trios);
        System.out.println(cost_cal(duos));

    }

    public static int cost_cal(List<List<Integer>> duos){
        List<Integer> totals = new ArrayList<>();

        for(List<Integer> duo : duos){
            System.out.println("Duo with first sum at the end: " + duo + ", Sum of duo: " + sum_of_array(duo) +  ", First sum: " + duo.getLast());
            // Fixed: removed the doubling - just sum_of_array(duo) + duo.getLast()
            totals.add(sum_of_array(duo) + duo.getLast());
        }

        System.out.println(totals);
        return Collections.min(totals);
    }

//    Expects [4,3,2,6], returns [a,b,c], eg. [6,3,6]

    public static List<List<Integer>> trio_array(ArrayList<Integer> rope_lengths){

        List<List<Integer>> trios = new ArrayList<>();

        int first_sum = rope_lengths.getFirst() + rope_lengths.get(2);
        int outer_sum = rope_lengths.getFirst() + rope_lengths.getLast();
        int inner_sum = rope_lengths.get(1) + rope_lengths.get(2);
        int last_sum = rope_lengths.get(1) + rope_lengths.getLast();
        int first_first = rope_lengths.getFirst() + rope_lengths.get(1);
        int last_last = rope_lengths.get(2) + rope_lengths.getLast();

        trios.add(new ArrayList<>(List.of(first_sum,rope_lengths.get(1), rope_lengths.getLast())));
        trios.add(new ArrayList<>(List.of(outer_sum,rope_lengths.get(1), rope_lengths.get(2))));
        trios.add(new ArrayList<>(List.of(inner_sum,rope_lengths.getFirst(), rope_lengths.getLast())));
        trios.add(new ArrayList<>(List.of(last_sum,rope_lengths.getFirst(), rope_lengths.get(2))));
        trios.add(new ArrayList<>(List.of(first_first, rope_lengths.get(2), rope_lengths.getLast())));
        trios.add(new ArrayList<>(List.of(last_last, rope_lengths.getFirst(), rope_lengths.get(1))));  // Fixed: changed get(2) to get(1)

        return trios;
    }

    //    Expects [6,3,6] returns [6,9]
    public static List<List<Integer>> duo_arrayWithFirstSum(List<List<Integer>> trios){

        List<List<Integer>> duos = new ArrayList<>();

        for(List<Integer> candidate : trios){
            int first_pair = candidate.getFirst() + candidate.get(1);
            int last_pair = candidate.get(1) + candidate.get(2);  // Fixed: changed to get(1) + get(2)
            int outer_pair = candidate.getFirst() + candidate.get(2);

            duos.add(new ArrayList<>(List.of(first_pair , candidate.get(2) , candidate.getFirst())));
            duos.add(new ArrayList<>(List.of(last_pair , candidate.getFirst(), candidate.get(1))));  // Fixed: changed to get(1)
            duos.add(new ArrayList<>(List.of(outer_pair , candidate.get(1), candidate.getFirst())));

        }
        return duos;
    }

    public static int sum_of_array(List<Integer> duo){

        int sum = 0;
        for(int i = 0; i < duo.size() - 1; i++){
            sum += duo.get(i);
        }
        return sum;
    }

}