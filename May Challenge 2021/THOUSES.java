import java.util.*;
import java.io.*;
class THOUSES{
    //SOLUTION BEGIN
    long MOD = (long)1e9+7;
    void pre() throws Exception{}
    void solve(int TC) throws Exception{
        int N = ni();
        long X = ni();
        int[] from = new int[N-1], to = new int[N-1];
        for(int i = 0; i< N-1; i++){
            from[i] = ni()-1;
            to[i] = ni()-1;
        }
        int[][] tree = make(N, from, to);
        long[] f = new long[N];
        dfs(tree, f, 0, -1);
        long ans = f[0]%MOD*X%MOD;
        pn(ans);
    }
    void dfs(int[][] g, long[] f, int u, int p){
        List<Long> list = new ArrayList<>();
        for(int v:g[u]){
            if(v == p)continue;
            dfs(g, f, v, u);
            list.add(f[v]);
        }
        Collections.sort(list, Collections.reverseOrder());
        f[u] = 1;
        int mul = 1;
        for(long x:list)
            f[u] += x * mul++;
    }
    int[][] make(int N, int[] from, int[] to){
        int[] cnt = new int[N];
        for(int x:from)cnt[x]++;
        for(int x:to)cnt[x]++;
        int[][] g = new int[N][];
        for(int i = 0; i< N; i++)g[i] = new int[cnt[i]];
        for(int i = 0; i< N-1; i++){
            g[from[i]][--cnt[from[i]]] = to[i];
            g[to[i]][--cnt[to[i]]] = from[i];
        }
        return g;
    }
    //SOLUTION END
    void hold(boolean b)throws Exception{if(!b)throw new Exception("Hold right there, Sparky!");}
    static boolean multipleTC = true;
    FastReader in;PrintWriter out;
    void run() throws Exception{
        in = new FastReader();
        out = new PrintWriter(System.out);
        //Solution Credits: Taranpreet Singh
        int T = (multipleTC)?ni():1;
        pre();for(int t = 1; t<= T; t++)solve(t);
        out.flush();
        out.close();
    }
    public static void main(String[] args) throws Exception{
        new THOUSES().run();
    }
    int bit(long n){return (n==0)?0:(1+bit(n&(n-1)));}
    void p(Object o){out.print(o);}
    void pn(Object o){out.println(o);}
    void pni(Object o){out.println(o);out.flush();}
    String n()throws Exception{return in.next();}
    String nln()throws Exception{return in.nextLine();}
    int ni()throws Exception{return Integer.parseInt(in.next());}
    long nl()throws Exception{return Long.parseLong(in.next());}
    double nd()throws Exception{return Double.parseDouble(in.next());}

    class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws Exception{
            br = new BufferedReader(new FileReader(s));
        }

        String next() throws Exception{
            while (st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (IOException  e){
                    throw new Exception(e.toString());
                }
            }
            return st.nextToken();
        }

        String nextLine() throws Exception{
            String str = "";
            try{   
                str = br.readLine();
            }catch (IOException e){
                throw new Exception(e.toString());
            }  
            return str;
        }
    }
}