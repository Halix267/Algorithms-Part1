public class QuickUnionUF
{
 private int[] id;
  
 public QuickUnionUF(int N)
 {
      id = new int[N];
      sze = new int[N];
      for (int i = 0; i < N; i++) id[i] = i;
 }
  
 private int root(int i)
 {
      while (i != id[i]) i = id[i];
       return i;
 }
  
 public boolean connected(int p, int q)
 {
      return root(p) == root(q);
 }
  
 public void union(int p, int q)
 {
      int i = root(p);
      int j = root(q);
      if (i == j) return;
      if (sz[i] < sz[j]) { id[i] = j; sz[j] += sz[i]; }
      else { id[j] = i; sz[i] += sz[j]; }
 }
}
