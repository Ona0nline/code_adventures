package org.connecting_ropes;

import java.util.ArrayList;
import java.util.List;

public class connecting_ropes {
//    We can connect the ropes in following ways.
// First connect ropes of lengths 2 and 3. Which makes the array [4, 5, 6]. Cost of
// this operation 2 + 3 = 5.
// Now connect ropes of lengths 4 and 5. Which makes the array [9, 6]. Cost of this
// operation 4 + 5 = 9.
// Finally connect the two ropes and all ropes have connected. Cost of this
// operation 9 + 6 =15. Total cost is 5 + 9 + 15 = 29. This is the optimized cost
// for connecting ropes.
//
//Other ways of connecting ropes would always have same or more cost. For example,
// if we connect 4 and 6 first (we get three rope of 3, 2 and 10), then connect 10
// and 3 (we get two rope of 13 and 2). Finally we connect 13 and 2. Total cost in
// this way is 10 + 13 + 15 = 38.

    public static void main(String[] args) {
//        How about I try all combinations and then find the min value of that?
        System.out.println(trio_array(new ArrayList<>(List.of(4,3,2,6))));
        List<List<Integer>> trios = trio_array(new ArrayList<>(List.of(4,3,2,6)));
        System.out.println(duo_array(trios));
    }

//    expects [6,9], adds the result of the sum of the array plus it's occupants altogetger into one array, then I find the miniumn
    public int cost_cal(List<List<Integer>> duos){
        List<Integer> totals = new ArrayList<>();

        return 0;
    }

//    Expects [4,3,2,6], returns [a,b,c], eg. [6,3,6]

    public static List<List<Integer>> trio_array(ArrayList<Integer> rope_lengths){

        List<List<Integer>> trios = new ArrayList<>();

        int first_sum = rope_lengths.getFirst() + rope_lengths.get(2);
        int outer_sum = rope_lengths.getFirst() + rope_lengths.getLast();
        int inner_sum = rope_lengths.get(1) + rope_lengths.get(2);
        int last_sum = rope_lengths.get(1) + rope_lengths.getLast();

        trios.add(new ArrayList<>(List.of(first_sum,rope_lengths.get(1), rope_lengths.getLast())));
        trios.add(new ArrayList<>(List.of(outer_sum,rope_lengths.get(1), rope_lengths.get(2))));
        trios.add(new ArrayList<>(List.of(inner_sum,rope_lengths.getFirst(), rope_lengths.getLast())));
        trios.add(new ArrayList<>(List.of(last_sum,rope_lengths.getFirst(), rope_lengths.get(2))));

        return trios;
    }

//    Expects [6,3,6] returns [6,9]
    public static List<List<Integer>> duo_array(List<List<Integer>> trios){

        List<List<Integer>> duos = new ArrayList<>();

        for(List<Integer> candidate : trios){
            int first_pair = candidate.getFirst() + candidate.get(1);
            int last_pair = candidate.get(1) + candidate.getFirst();
            int outer_pair = candidate.getFirst() + candidate.getLast();

            duos.add(new ArrayList<>(List.of(first_pair , candidate.getLast())));
            duos.add(new ArrayList<>(List.of(last_pair , candidate.getFirst())));
            duos.add(new ArrayList<>(List.of(outer_pair , candidate.get(1))));

        }
        return duos;
    }

}
