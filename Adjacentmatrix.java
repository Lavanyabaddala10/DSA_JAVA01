class graph
{
    int ver;
    int [][] arr;
    graph(int size)
    {
        this.ver=size;
        arr=new int[ver][ver];
    }
    void add(int x,int y)
    {
        arr[x][y]=1;
        arr[y][x]=1;
    }
    void print()
    {
        for(int i=0;i<ver;i++)
        {
            for(int j=0;j<ver;j++)
            {
                System.out.println(arr[i][j]+" ");
            }
        }
    }
    public class Adjacentmatrix
    {
     public static void main (String[] args)
        {
            graph g=new graph(4);
            g.add(0,1);
            g.add(0,2);
            g.add(1,2);
            g.add(2,3);
            g.print();
        }
    }
    
}