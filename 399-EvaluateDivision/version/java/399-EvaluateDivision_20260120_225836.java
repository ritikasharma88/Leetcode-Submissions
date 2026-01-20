// Last updated: 1/20/2026, 10:58:36 PM
1import java.util.*;
2
3class Solution {
4    public double[] calcEquation(
5            List<List<String>> equations,
6            double[] values,
7            List<List<String>> queries) {
8
9      
10        Map<String, Map<String, Double>> graph = new HashMap<>();
11
12        for (int i = 0; i < equations.size(); i++) {
13            String a = equations.get(i).get(0);
14            String b = equations.get(i).get(1);
15            double val = values[i];
16
17            graph.putIfAbsent(a, new HashMap<>());
18            graph.putIfAbsent(b, new HashMap<>());
19
20            graph.get(a).put(b, val);
21            graph.get(b).put(a, 1.0 / val);
22        }
23
24        double[] result = new double[queries.size()];
25
26        for (int i = 0; i < queries.size(); i++) {
27            String src = queries.get(i).get(0);
28            String dst = queries.get(i).get(1);
29
30            if (!graph.containsKey(src) || !graph.containsKey(dst)) {
31                result[i] = -1.0;
32            } else if (src.equals(dst)) {
33                result[i] = 1.0;
34            } else {
35                result[i] = dfs(src, dst, 1.0, new HashSet<>(), graph);
36            }
37        }
38
39        return result;
40    }
41
42    private double dfs(String curr, String target, double product,
43                       Set<String> visited,
44                       Map<String, Map<String, Double>> graph) {
45
46        if (curr.equals(target)) return product;
47
48        visited.add(curr);
49
50        for (Map.Entry<String, Double> next : graph.get(curr).entrySet()) {
51            if (!visited.contains(next.getKey())) {
52                double res = dfs(
53                        next.getKey(),
54                        target,
55                        product * next.getValue(),
56                        visited,
57                        graph
58                );
59                if (res != -1.0) return res;
60            }
61        }
62
63        return -1.0;
64    }
65}