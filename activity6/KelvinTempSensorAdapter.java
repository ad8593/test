// implementing the interface activity 6 task 4
 class KelvinTempSensorAdapter implements ITempSensor{
 
 private KelvinTempSensor tem;
 
 public KelvinTempSensorAdapter(KelvinTempSensor _tem){
  tem = _tem;
 } 
 
  // task 4
  public int reading(){
    return tem.reading(); 
  }
}