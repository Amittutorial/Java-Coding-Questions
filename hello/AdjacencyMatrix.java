 class AdjacencyMatrix {
   int vertices;
   int graph[][];

  AdjacencyMatrix (int vertices)
   {
    this .vertices=vertices;
    graph= new int[vertices][vertices];
   }

   void add(int s,int d)
   {
    graph[s][d]=1;
    graph[d][s]=1;
   }
    void display()
    {
        for( int i=0;i<vertices;i++)
        {
            for(int j=0;j<vertices;j++)
            {
                System.out.print("| "+graph[i][j]+" |");
            }
            System.out.println();
        }
    }
        public static void main(String args[])
            {
              AdjacencyMatrix n=new AdjacencyMatrix(4);
              n.add(0,1);
              n.add(1,3);
              n.add(1,2);
               n.add(0,3);
                n.add(1,3);
              
              n.display();
              
            }
        
    }