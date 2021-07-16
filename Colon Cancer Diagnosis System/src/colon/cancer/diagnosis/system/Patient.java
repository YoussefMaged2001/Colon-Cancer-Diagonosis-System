package colon.cancer.diagnosis.system;

import static colon.cancer.diagnosis.system.Singleton.read;

public class Patient extends Person{
     int ID;
    private Cell cell;

    public Patient(int ID) {
        this.ID = ID;
        cell = new Cell(read.ReadPatientCondition(ID));
        for (int i = 0 ; i < 201 ; i++)
        {
            double value = Double.parseDouble(read.ReadPatientGeneValue(ID, i+1));
            
            cell.set_Gene(i, value);
  
        }
    }
    
    public Cell getCell()
    {
        return cell;
    }
    
    public double CompareWith(Patient patient)
    {
        double  sum=0;
        for (int i = 1 ; i <= 201 ; i++)
        {
              sum += Math.pow((cell.getGene(i).value - patient.getCell().getGene(i).value), 2);
        }
        sum = Math.sqrt(sum);
        return sum;
    }
    
    
    
}