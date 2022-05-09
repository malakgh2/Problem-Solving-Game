/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stage2_BranchAndBound;

import java.awt.Color;
import static java.lang.Math.random;
import java.util.*;

/**
 *
 * @author LENOVO
 */
public class probleme {
    public static int[][] mountain;
    public static int nbPiquets;
    protected static long cost=0L;
    public static int startPiquet;
    public static List<Integer> finalCycle;
    public static Queue<Node> leafQueue =new LinkedList<>();
    public static List<Integer> couleur =new ArrayList<>();

    
    
    public static long calculate_cost(ArrayList<Integer> cycle){
        long cost = 0l; 
        for (int i=0 ; i<cycle.size()-1 ; i++)
        {
            int indexCurrent = cycle.get(i) ; 
            int indexNext = cycle.get(i+1)  ;
            cost += mountain[indexCurrent-1][indexNext-1] ;
        }
        return cost ; 
    }
    public static String affect_color(int c)
    {
        String color ; 
      /*  switch (c)
        {
            case 1 : 
            case 2 :
            case 3 :
            case 4 : 
            case 5 : 
            case 6 : 
            case 7 : 
            case 8 : 
            case 9 : 
            default : 
        }*/
        if (c == 1)     color = "red" ; 
        else if (c== 2 )color = "yellow" ; 
        else if (c== 3 )color = "blue" ; 
        else if (c== 4 )color = "green" ; 
        else if (c== 5 )color = "pink" ; 
        else if (c== 6 )color = "purple" ; 
        else if (c== 7 )color = "grey" ; 
        else if (c== 8 )color = "black" ; 
        else if (c== 9 )color = "white" ; 
        else            color = "beige" ; 
            
            
        return color ; 
    }
    public static void initialiser ()
    {
        nbPiquets =0  ;
        cost = 0l ; 
        leafQueue=new LinkedList<>();
        couleur=new ArrayList<>();
        finalCycle = new ArrayList<>() ; 
        
    }
    
    
    //generate colors
    public static void generateColors(int n){
        Random random = new Random() ; 
        for(int i =0;i<n;i++){
            couleur.add(random.nextInt(11));
        }
        System.out.println(couleur);
    }


    
    //generates a mountain matrix randomly
    public static void generateGraph(int N)
    {
        Random rd=new Random();
        nbPiquets=N;
        mountain=new int[N][N];
        for (int i = 0; i < nbPiquets; i++) {
            mountain[i][i]=Integer.MAX_VALUE;
            for (int j = 0; j < nbPiquets; j++)
            {
                if(i!=j)
                    mountain[i][j]=1+rd.nextInt(100);
                //graph[j][i]=mountain[i][j];
            }
        }
    }
    //prints the mountain matrix
    public static String showMountain() {
        
  String aff = "" ; 
        for (int i =0 ;i< couleur.size() ; i++)
        {
            
            aff += "piquet " + (i+1) + " est " + affect_color(couleur.get(i))+ "\n";
        }
        
        for (int i = 0 ; i < nbPiquets ; i++)
        {
            for(int j = 0 ; j< nbPiquets ; j++)
            {
                if(mountain[i][j] == Integer.MAX_VALUE)
                    aff = aff + "[0]"   ; 
                else
                aff = aff + "["+mountain[i][j]+"]"   ; 
               
            }
            aff += "\n" ; 
        }
        return aff ; 
        
    }
    //find the minimum of the given array
    public static int min(int[] T)
    {
        int min=Integer.MAX_VALUE;
        for (int x:T) {
            if(x<min)
                min=x;
        }
        if(min==Integer.MAX_VALUE)
            min=0;
        return min;
    }

    //returns the column of given index from the matrix M
    public static int[] getColumn(int[][] M, int columnIndex) {
        int[] column = new int[M.length];
        for (int i = 0; i < M.length; i++) {
            column[i]=M[i][columnIndex];
        }
        return column;
    }
    //loop matrix rows and the columns and substract the min from each case.
    //returns the reduction's cost
    public static int reduce(int[][] M)
    {
        int reductionCost=0;
        for (int[] row: M) {
            int m=min(row);
            reduceArray(row,m);
            reductionCost+=m;
        }

        for (int i = 0; i <nbPiquets ; i++) {
            int[] column=getColumn(M,i);
            int m=min(column);
            for (int j = 0; j < nbPiquets; j++) {
                if(M[j][i]!=Integer.MAX_VALUE)
                    M[j][i]-=m;
            }
            reductionCost+=m;
        }

        return reductionCost;
    }
    //reduces one row or one column
    private static void reduceArray(int[] T,int min) {
        for (int i = 0; i < T.length; i++) {
            if(T[i]!=Integer.MAX_VALUE)
                T[i]-=min;
        }
    }
    //returns the node with the minimal cost
    public static Node getMinLeaf(Queue<Node> leafQueue)
    {
        Iterator<Node> it=leafQueue.iterator();
        Node minNode = it.next();
        while(it.hasNext())
        {
            Node n=it.next();
            if(n.compareTo(minNode)<0)
                minNode =n;
        }
        return minNode;
    }
    //returns possible next nodes for the node n.
    //a modifie : couleur
     public static List<Node> getPossibleChildrenNodes(Node n,double couleurinterdite){
        List<Node> lstChilderen=new ArrayList<>();
        for (int i = 1; i <=nbPiquets ; i++) {//loop cities numbers
            if(!n.getCurrentWay().contains(i)&&n.getCouleur()!=couleurinterdite)  //if the cities is not aleady visited
            {
                Node node=new Node();
                node.setCityNumber(i);
                node.setCouleur(couleur.get(i-1));
                List<Integer> ncurrentWay=n.getCurrentWay();
                //node.setCurrentWay(new ArrayList<>(n.getCurrentWay()));
                //node.getCurrentWay().add(i);
                //or
                List<Integer> nodeCurrentWay=new ArrayList<>(n.getCurrentWay());
                nodeCurrentWay.add(i);
                node.setCurrentWay(nodeCurrentWay);
                node.setReducedMatrix(copyGraph(n.getReducedMatrix()));
                if(node.getCouleur()!=couleurinterdite){
                lstChilderen.add(node);}

            }
        }

        return lstChilderen;
    }


    public static void setNodeCost(Node n, Node parent){
        //pretreatment
        int[][] M=n.getReducedMatrix();
        for (int i = 0; i < nbPiquets; i++) {
            M[parent.getCityNumber()-1][i]=Integer.MAX_VALUE;
            M[i][n.getCityNumber()-1]=Integer.MAX_VALUE;
        }
        M[n.getCityNumber()-1][startPiquet-1]=Integer.MAX_VALUE;

        int reductionCost=reduce(M);
        n.setCost(reductionCost+ parent.getCost()+mountain[parent.getCityNumber()-1][n.getCityNumber()-1]);
    }
    
    
    

        public static void solution(int start,int couleurInterdite,int Destination){
        System.out.println(couleurInterdite);
        startPiquet=start;
        //create the first node associated to the start city
        Node currentNode =new Node();
        currentNode.setCouleur(couleur.get(start-1));
        System.out.println(currentNode.getCouleur());

        currentNode.setCityNumber(startPiquet);
        currentNode.getCurrentWay().add(startPiquet);
        System.out.println("Reduced Graph : ");
        showMountain();
        int[][] graphCopy=copyGraph(mountain);
        int reductionCost=reduce(graphCopy);
        currentNode.setCost(reductionCost);
        currentNode.setReducedMatrix(graphCopy);
        currentNode.setReadyNode(true);
        System.out.println("first reduction cost = "+reductionCost);
        leafQueue.offer(currentNode);//add the start node to the leaf's queue
        while(!leafQueue.isEmpty()&&currentNode.getCurrentWay().get(currentNode.getCurrentWay().size()-1) != Destination)

        {

            List<Node> lstChilderen= getPossibleChildrenNodes(currentNode,couleurInterdite);
            if(!lstChilderen.isEmpty()) {
                for (Node x : lstChilderen) {
                    if (!x.isReadyNode() && x.getCouleur()!=couleurInterdite) {
                        System.out.println("couleur " + x.getCouleur()+" piauet "+x.getCityNumber());
                        setNodeCost(x, currentNode);
                        x.setReadyNode(true);
                    }
                }

                leafQueue.remove(currentNode);

                leafQueue.addAll(lstChilderen);//add all children as leaf to the queue
                currentNode = getMinLeaf(leafQueue);
            }
            cost=currentNode.getCost();

        }
        finalCycle=new ArrayList<>(currentNode.getCurrentWay());
    }



    private static int[][] copyGraph(int[][] M) {
        int[][] copy = new int[M.length][M.length];
        for (int i=0; i<M.length; i++)
            for (int j = 0; j < nbPiquets; j++)
                copy[i][j] = M[i][j];
        return copy;
    }
}
