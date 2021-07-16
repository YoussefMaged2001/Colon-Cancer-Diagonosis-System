
package colon.cancer.diagnosis.system;


public class ColonCancerDiagnosisSystem {
  
    public static Singleton Program;
    
    public static void main(String[] args) {        
       Program = Singleton.GetInstance();
      
       Program.Draw();
       
        //Program.InitializeProgram(path, 62, 201, 32, 30);
       
        
    }
    
}
