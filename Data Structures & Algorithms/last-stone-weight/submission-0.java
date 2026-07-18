class Solution {
    public int lastStoneWeight(int[] stones) 
    {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones)
        {
            maxHeap.offer(stone);
        }    
        while(maxHeap.size()>1)
        
        {
            int x=maxHeap.poll();//largest
            int y=maxHeap.poll();// 2nd largest
            if(x!=y)
            {
                maxHeap.offer(x-y);
            }
        }
        return maxHeap.isEmpty()?0:maxHeap.peek();
    }
}
