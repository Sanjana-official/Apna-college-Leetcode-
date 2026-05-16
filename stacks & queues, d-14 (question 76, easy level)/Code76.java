class Code76 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;

        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                time += Math.min(tickets[i], tickets[k]);
            } else {
                time += Math.min(tickets[i], tickets[k] - 1);
            }
        }

        return time;
    }
}

// class Solution {
//     public int timeRequiredToBuy(int[] tickets, int k) {
//         int n = tickets.length;
//         int time = 0;

//         int i = 0;
//         while (tickets[k] > 0) {
//             if (tickets[i] > 0) {
//                 tickets[i]--;
//                 time++;
//             }
//             i++;
//             if(i == n) i = 0;
//         }
//         return time;
//     }
// }