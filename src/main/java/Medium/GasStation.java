package Medium;

public class GasStation {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas, cost));
    }
public static int canCompleteCircuit(int[] gas, int[] cost) {
    int startPointIdx = 0;
    int additionalGasNeeded = 0;
    int totalGasInTask = 0;
    for (int i = 0; i < gas.length; i++) {
        totalGasInTask = totalGasInTask + gas[i] - cost[i];
        if(totalGasInTask < 0){
            additionalGasNeeded = additionalGasNeeded + totalGasInTask;
            totalGasInTask = 0;
            startPointIdx = i+1;
        }
    }

    if(totalGasInTask + additionalGasNeeded >= 0){
        return startPointIdx;
    }else{
        return -1;
    }


}
}