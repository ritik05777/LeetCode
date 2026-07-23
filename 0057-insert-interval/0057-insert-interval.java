class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int []>list=new ArrayList<>();
         List<int []>list2=new ArrayList<>();
        boolean insert=false;
          for(int i=0;i<intervals.length;i++){
            int start=intervals[i][0];
            if(insert==false && start>=newInterval[0]){
                list.add(new int[]{newInterval[0],newInterval[1]});
                insert=true;
            }
            list.add(new int[]{intervals[i][0],intervals[i][1]});
          }
          if(insert==false){
             list.add(new int[]{newInterval[0],newInterval[1]});
          }
          int start1=list.get(0)[0];
           int end1=list.get(0)[1];
           for(int i=1;i<list.size();i++){
              int start2=list.get(i)[0];
              int end2=list.get(i)[1];
              if(end1>=start2){
                end1=Math.max(end1,end2);
                continue;
              }
              list2.add(new int[]{start1,end1});
              start1=start2;
              end1=end2;
           }
           list2.add(new int[]{start1,end1});
            return list2.toArray(new int[list2.size()][]);

             
           
         }
             
    }
