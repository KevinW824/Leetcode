class Solution {
    public int openLock(String[] deadends, String target) {
        HashSet<String> de = new HashSet<String>();
        for (String str : deadends) {
            de.add(str);
        }
        String source = "0000";
        if (de.contains(source)) {
            return -1;
        }
        int step = 0;
        HashSet<String> visited = new HashSet<String>();
        Deque<String> queue = new ArrayDeque<String>();
        queue.offer(source);
        visited.add(source);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i=0; i<size; i++) {
                String curr = queue.poll();
                if (de.contains(curr)) {
                    continue;
                }
                if (curr.equals(target)) {
                    return step;
                }
                for (int j=0; j<4; j++) {
                    char[] tempAdd = curr.toCharArray();
                    char[] tempMinus = curr.toCharArray();
                    tempAdd[j] = (char)((tempAdd[j] - '0' + 1) % 10 + '0');
                    tempMinus[j] = (char)(((tempMinus[j]-'0'-1)%10+10)%10 + '0');
                    String afterAdd = new String(tempAdd);
                    String afterMinus = new String(tempMinus);
                    if (!(visited.contains(afterAdd)||de.contains(afterAdd))) {
                        queue.offer(afterAdd);
                        visited.add(afterAdd);
                        
                    }
                    if (!(visited.contains(afterMinus)||de.contains(afterMinus))) {
                        queue.offer(afterMinus);    
                        visited.add(afterMinus);
                    }
                }
            }
            step++;
        }
        return -1;
    }
}
