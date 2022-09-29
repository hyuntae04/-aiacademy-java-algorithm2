import java.util.Random;

public class 로또생성기 {
    public static void main(String[] args) {
        solution();
    }
    public static int solution()
    {
        String title = "로또 생성기\n";
        Random random = new Random();
        String result = "";
        int[] arr = new int[6];
        int pos = 0;
        boolean same = true;
        
        for(int i = 0;i<6;i++)
        {
            while (true)
            {
                int num = random.nextInt(45) + 1;
                for(int j=0;j<6;j++)
                {
                    if(num == arr[j])
                    {
                        same = true;
                    }
                }
                if(same == false)
                {
                    arr[i] = num;
                    break;
                }
                same = false;
            }
        }  
        System.out.printf("%d %d %d %d %d %d", arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
        return 0;
    }
}
