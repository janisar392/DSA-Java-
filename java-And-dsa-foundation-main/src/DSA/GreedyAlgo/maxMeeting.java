package DSA.GreedyAlgo;

import java.util.Arrays;

public class maxMeeting {
    public static class Meeting{
        int start , end ;
        Meeting(int start , int end){
            this.start = start;
            this.end = end;
        }
    }

    public int maxMeetings(int start[], int end[]){
        int n = start.length;
        Meeting[] meeting = new Meeting[n];

        for(int i =0 ; i< n ; i++){
            meeting[i] = new Meeting(start[i] , end[i]);
        }

        Arrays.sort(meeting , (a,b) -> Integer.compare(a.end , b.end));

        int count =0;
        int lastEnd =-1;

        for(Meeting m : meeting){
            if(m.start > lastEnd){
                count++;
                lastEnd = m.end;
            }
        }
        return count;
    }
}
