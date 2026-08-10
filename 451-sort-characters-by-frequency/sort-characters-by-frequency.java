class Solution {
    public String frequencySort(String s)
    {   
        StringBuilder ans=new StringBuilder();
        
        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> pq= new PriorityQueue<>((a, b) -> counts.get(b) - counts.get(a));
        pq.addAll(counts.keySet());
        while (!pq.isEmpty())
        {
            char ch = pq.poll();
            int count = counts.get(ch);
            
            for (int i = 0; i < count; i++)
            {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}