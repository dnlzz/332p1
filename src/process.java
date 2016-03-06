
public class process  {
   String name;
   int ArrivalTime, ServiceTime, FinishTime, TimeLeft;

   public process(String n, int a, int s) {
      name=n;
      ArrivalTime=a;
      ServiceTime=TimeLeft=s;
   }

   public int getArrival() { return ArrivalTime; }
   public String getName() { return name; }
   public int getService() { return ServiceTime; }
   public int getFinish() { return FinishTime; }
   public void processing() { TimeLeft--;}

} // process class