package colon.cancer.diagnosis.system;

import static colon.cancer.diagnosis.system.Singleton.read;

public class Cell {
    private Gene []gene=new Gene[201];
    private final String actual;
    private String predicted;

    Cell(String actualCondition) {
        this.actual = actualCondition;
    }
    
    public void set_Gene(int index,double value)
    {
        gene[index] = new Gene(value,read.ReadGeneName(index));
    }
    
    String getActualCondition()
    {
        return actual;
    }
    
    void setPredictedCondition(String predicted)
    {
        this.predicted = predicted;
    }
    
    String getPredictedCondition()
    {
        return predicted;
    }
    
    public Gene getGene(int index)
    {
        return gene[index - 1];
    }
    
}