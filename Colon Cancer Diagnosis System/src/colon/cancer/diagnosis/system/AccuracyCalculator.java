
package colon.cancer.diagnosis.system;

import static colon.cancer.diagnosis.system.Singleton.patients;

public class AccuracyCalculator {
    public double getAccuracy(int PatientsNum, int TestingPatients){
        int correct = 0;
        for(int i = PatientsNum - TestingPatients ; i < PatientsNum; i++)
        {
            if(patients[i].getCell().getActualCondition().equals(patients[i].getCell().getPredictedCondition()))
                correct++;
        }
       double accuracy = (((double)correct / TestingPatients) * 100);    
       return accuracy;
    }
}
