
/**
 * Write a description of class MMM here.
 *
 * @author (Tal)
 * @version (910)
 */
public class MMM
{
    private int[] nums = new int[100];
    public MMM()
    {

    }

    public void loadArray(){
        for(int i = 0; i<nums.length;i++){
            nums[i] = (int)(Math.random()*10) + 1;
        }

    }

    public void printArray(){
        for(int i = 0; i<nums.length;i++){
            System.out.print(nums[i] + ", ");
            if(i%15 == 14){
                System.out.println();
            }
        }

    }

    public int getSum(){
        int sum = 0;
        for(int i = 0; i<nums.length;i++){
            sum += nums[i];
        }
        return sum;

    }

    public double getMean(){
        double mean = (getSum())/(double)nums.length;
        return mean;
    }

    public int getMedian(){
        int[] numlist = new int[100];
        for(int i=0;i<100;i++){
            for(int j=1;j<11;j++){
                if(nums[i] == j){
                    numlist[i] = j;
                }
            }
        }
        if(numlist.length%2 == 0){
            return ((numlist[numlist.length/2] + numlist[numlist.length/2 + 1])/2);
        }
        else{
            return (numlist[numlist.length/2]);
        }
    }

    public void getMode(){
        int[] numlist = new int[100];
        int [] counterlist = new int[10];
        int onecounter = 0;
        int twocounter = 0;
        int threecounter = 0;
        int fourcounter = 0;
        int fivecounter = 0;
        int sixcounter = 0;
        int sevencounter = 0;
        int eightcounter = 0;
        int ninecounter = 0;
        int tencounter = 0;
        int countermax = 0;
        for(int i=0;i<100;i++){
            for(int j=1;j<11;j++){
                if(nums[i] == 1){
                    onecounter += 1;
                }
                if(nums[i] == 2){
                    twocounter += 1;
                }
                if(nums[i] == 3){
                    threecounter += 1;
                }
                if(nums[i] == 4){
                    fourcounter += 1;
                }
                if(nums[i] == 5){
                    onecounter += 1;
                }
                if(nums[i] == 6){
                    sixcounter += 1;
                }
                if(nums[i] == 7){
                    sevencounter += 1;
                }
                if(nums[i] == 8){
                    eightcounter += 1;
                }
                if(nums[i] == 9){
                    ninecounter += 1;
                }
                if(nums[i] == 10){
                    tencounter += 1;
                }
            }
        }
        counterlist[0] = onecounter;
        counterlist[1] = twocounter;
        counterlist[2] = threecounter;
        counterlist[3] = fourcounter;
        counterlist[4] = fivecounter;
        counterlist[5] = sixcounter;
        counterlist[6] = sevencounter;
        counterlist[7] = eightcounter;
        counterlist[8] = ninecounter;
        counterlist[9] = tencounter;
        for(int i = 0; i<counterlist.length;i++){
            if(counterlist[i] > countermax){
                counterlist[i] = countermax;
            }
        }
    }
}