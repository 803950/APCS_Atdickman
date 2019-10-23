
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
            if(i%15 == 0){
                System.out.println();
            }
        }

    }

    public int getSum(){
        int sum = 0
        for(int i = 0; i<nums.length;i++){
            sum += nums[i];
        }
    }
