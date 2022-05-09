/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stage2_BranchAndBound;

import java.util.*;

/**
 *
 * @author LENOVO
 */
public class Node implements Comparable<Node> {

    private int cityNumber;
    private int cost;
    private int[][] reducedMatrix;
    private List<Integer> currentWay=new ArrayList<>();
    private boolean isReadyNode =false;
    private int couleur;

    @Override
    public int compareTo(Node o) {
        if(o ==null)
            return 1;
        return this.cost-o.cost;

    }

    public int getCityNumber() {
        return cityNumber;
    }

    public void setCityNumber(int cityNumber) {
        this.cityNumber = cityNumber;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int[][] getReducedMatrix() {
        return reducedMatrix;
    }

    public void setReducedMatrix(int[][] reducedMatrix) {
        this.reducedMatrix = reducedMatrix;
    }

    public List<Integer> getCurrentWay() {
        return currentWay;
    }

    public void setCurrentWay(List<Integer> currentWay) {
        this.currentWay = currentWay;
    }

    public boolean isReadyNode() {
        return isReadyNode;
    }

    public void setReadyNode(boolean readyNode) {
        isReadyNode = readyNode;
    }

    public int getCouleur() {
        return couleur;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }    
}
