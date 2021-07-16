
package colon.cancer.diagnosis.system;

import colon.cancer.diagnosis.system.GUI.MainFrame;
import javax.swing.JFrame;

  

public class Singleton {
    public static boolean initialised = false; 
    private static Singleton instance = new Singleton();
 
    private Singleton()
    {
        
    }
    public static Reader read;
    public static Patient[] patients;
    public static Classifier classifier;
    private static int PatientsNum, GenesNum, TrainingPatients, TestingPatients;

    public static int getPatientsNum() {
        return PatientsNum;
    }

    public static int getGenesNum() {
        return GenesNum;
    }

    public static int getTrainingPatients() {
        return TrainingPatients;
    }

    public static int getTestingPatients() {
        return TestingPatients;
    }

    
    public static Singleton GetInstance()
    {
        return instance;
    }
    
    public void Draw()
    {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
       
        
    }
    
    public void InitializeProgram(String DataPath, int PatientsNum, int GenesNum, int TrainingPatients, int TestingPatients) {
        read = new Reader(DataPath, GenesNum+2 , PatientsNum+1);
        patients = new Patient[PatientsNum];
        this.PatientsNum = PatientsNum;
        this.GenesNum = GenesNum;
        this.TrainingPatients = TrainingPatients;
        this.TestingPatients = TestingPatients;
        initialised = true;
        classifier = new Classifier();
        //Intializing Patients From DataSet
        for(int i = 0;i<PatientsNum;i++)
        {
            patients[i] = new Patient(i+1);
        }
        
       
    }
    
   
    
    //Examine Specific Patient
    public String Examine(int PatientID)
    {
         PatientID -= 1 ;
         patients[PatientID].getCell().setPredictedCondition(classifier.Examine(patients[PatientID]));
         return patients[PatientID].getCell().getPredictedCondition();
    }
    
    //Examine All Patients
    public void Examine()
    {
        for(int i = TrainingPatients ; i<PatientsNum ; i++)
        {  
            patients[i].getCell().setPredictedCondition(classifier.Examine(patients[i]));
            //System.out.println((i+1)+ "- " + patients[i].getCell().getActualCondition() + "  " + patients[i].getCell().getPredictedCondition());
        }
    }
    
    public String getPatientPredictedCondition(int PatientID)
    {
        Examine(PatientID);
        return patients[PatientID-1].getCell().getPredictedCondition();
    }
    public String getPatientActualCondition(int PatientID)
    {
        return patients[PatientID-1].getCell().getActualCondition();
    }
    
    public void AddPatientINFO(int PatientID, String Name, int age, char Gender)
    {
        patients[PatientID-1].setName(Name);
        patients[PatientID-1].setAge(age);
        patients[PatientID-1].setGender(Gender);
    }
    
    public Patient GetPatient(int PatientID)
    {
        Examine(PatientID);
        return patients[PatientID-1];
    }
    
    public String GetGeneName(int GeneNum)
    {
        return read.ReadGeneName(GeneNum);
    }
    
    public double getProgramAccuracy()
    {
        Examine();
        AccuracyCalculator Acc = new AccuracyCalculator();
        return Acc.getAccuracy(PatientsNum, TestingPatients);
    }
    
    public double getDistance(int index, int patientID){
        classifier.Examine(patients[patientID]);
        return classifier.getDistance(index);
    }
    
}
