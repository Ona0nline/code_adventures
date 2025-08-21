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
    }

//    expects [6,9], adds the result of the sum of the array plus it's occupants altogetger into one array, then I find the miniumn
    public int cost_cal(ArrayList<Integer> rope_lengths){
        return 0;
    }

//    Expects [4,3,2,6], returns [a,b,c], eg. [6,3,6]

    public List<Integer> trio_array(ArrayList<Integer> rope_lengths){
        //        [4,3,2,6]
//        Connect them using FOIL method? There will be four iterations whereby everyone
//        gets a turn to be the first connection
//        For [a,b,c], will get a turn to be outer matched and inner matched

        return new ArrayList<>();
    }

//    Expects [6,3,6] returns [6,9]
    public List<Integer> duo_array(ArrayList<Integer> rope_lengths){
        return new ArrayList<>();
    }
}
