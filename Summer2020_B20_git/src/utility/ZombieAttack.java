package utility;

import java.util.*;

public class ZombieAttack {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] inhabitants = new int[8];
            for(int i=0; i<inhabitants.length; i++) {
                inhabitants[i] = input.nextInt();
            }
            int num=0;
            for (int x =0; ;x++) {
                System.out.println("Day " + x + " " + Arrays.toString(inhabitants));
                num=0;
                for(int each: inhabitants){
                    num +=each;
                }
                if (num==0){
                    System.out.println("---- EXTINCT ----");
                    break;
                }
                if (inhabitants[0] > 0 && inhabitants[1]==0 ) {
                    inhabitants[0] /= 2;
                }
                if (inhabitants[inhabitants.length - 1] > 0 && inhabitants[inhabitants.length - 2]==0 ) {
                    inhabitants[inhabitants.length - 1] /= 2;
                }
                for (int i = 1; i <= inhabitants.length - 2; i++) {
                    if (inhabitants[i] > 0 && inhabitants[i - 1]>0 &&  inhabitants[i + 1]==0){
                        inhabitants[i] /= 2;
                    }
                    if (inhabitants[i] > 0 && inhabitants[i - 1]==0 && inhabitants[i+1]>0){
                        if (inhabitants[i]==1) {
                            inhabitants[i] /= 2;
                            i++;
                            if (i==7){
                                i--;
                            }
                        }else {
                            inhabitants[i] /= 2;
                        }
                    }
                    if (inhabitants[i] > 0 && inhabitants[i - 1]==0 && inhabitants[i+1]==0){
                        inhabitants[i] /= 2;
                    }
                }
            }
        }
    }



