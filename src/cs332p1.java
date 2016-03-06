import java.util.ArrayList;

/*
Anthony Degliomini
CS-332-102
Project Spring 2016
Prof. Lay
*/

public class cs332p1 {

	int timeUnit;
	
    public static void main(String args[]) {
                
    	ArrayList<process> pids = new ArrayList<process>();
    	
    	process p1 = new process("A", 0, 3);
    	process p2 = new process("B", 2, 6);
    	process p3 = new process("C", 4, 4);
    	process p4 = new process("D", 6, 5);
    	process p5 = new process("E", 8, 2);
    	
    	pids.add(p1);
    	pids.add(p2);
    	pids.add(p3);
    	pids.add(p4);
    	pids.add(p5);
    	
    	for (process p : pids) {
    		System.out.println(p.getArrival());
    	}

    }

}