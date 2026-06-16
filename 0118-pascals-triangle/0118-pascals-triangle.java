class Solution {
    public static List<Integer> NCR(int Row){
        List<Integer>list=new ArrayList<>();
        int ans=1;
        list.add(ans);
        for(int i=1;i<Row;i++){
            ans=ans*(Row-i);
            ans=ans/i;
            list.add(ans);
        }  
        return list; 
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>nums=new ArrayList<>();
        if(numRows==0){
            nums.add(Arrays.asList(0));
        }
        if(numRows==1){
            nums.add(Arrays.asList(1));
        }
        else if(numRows>=2){
        for(int i=1;i<=numRows;i++){
            nums.add(NCR(i));
        }
        
        } 
        return nums;

    }
}